package api;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

import static io.restassured.RestAssured.given;

public class createcompanyAPI {
    @BeforeMethod
    public void beforeTes() {
        RestAssured.baseURI = "https://stagingapi.cicle.app";
        token = "jwt eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyIjp7ImRlZmF1bHRDb21wYW55IjpudWxsLCJfaWQiOiI2MzQ2Y2Q0YjY5OWJjMDQ4NzFhNzZjYzMiLCJnb29nbGVJZCI6IjEwMzc0Mzc1MjY3OTQ5NzExMzc3NCIsImVtYWlsIjoiZmFsZGlvYmVydG9uMTdAZ21haWwuY29tIiwiZnVsbE5hbWUiOiJGYWxkaSBPYmVydG9uIiwicGhvdG9VcmwiOiJodHRwczovL2xoMy5nb29nbGV1c2VyY29udGVudC5jb20vYS9BTG01d3UyMElSd0RQTG5MaXJ6MEdRb2VMZmw5RE9aVTNRcmJ0NDZQWFJkOGlRPXM5Ni1jIiwiYmlvIjoiIiwic3RhdHVzIjoiIiwiY29tcGFuaWVzIjpbXSwiY3JlYXRlZEF0IjoiMjAyMi0xMC0xMlQxNDoyMDo1OS4wNzFaIiwidXBkYXRlZEF0IjoiMjAyMy0wMS0yMVQxMjoxOTowNS4yNzNaIiwiX192IjowfSwiaWF0IjoxNjc0MzAzNTQ1LCJleHAiOjE2NzY4OTU1NDV9.6bG453G_ZD-R69l3ZPJuO96OoJu-we-q6KlikqDqZBs";
    }
    String token = "";
    JSONObject payload = new JSONObject();
    Random rand = new Random();
    String boardId = "";
    String listId = "";
    String companyId = "";
    @Test(priority = 1)
    public void createCompany() {
        Random rand = new Random();
        String companyName = "SekolahQA" + rand.nextInt(1000);
        payload.put("name", companyName);
        payload.put("desc", "descc");


        Response response = given()
                .when()
                .header("Content-Type", "application/json")
                .header("Authorization", token)
                .body(payload.toJSONString())
                .post("/api/v1/companies")
                .then()
                .log().body()
                .statusCode(200)
                .extract()
                .response();
        JsonPath responseParsed = response.jsonPath();
        companyId = responseParsed.getString("newCompany._id");
        System.out.println(companyId);
       // List companyList = responseParsed.getList("companies");
      //  return responseParsed.getString("companies[" +(companyList.size()-1) + "]._id");

    }
    @Test(priority = 2)
    public void UsercreateTeam () {
        String teamName = "Batch16" + rand.nextInt(1000);
        String teamId = "";
        payload.put("name", teamName);
        payload.put("desc", "descc");
        payload.put("type", "team");


        Response response = given()
                .when()
                .header("Content-Type", "application/json")
                .header("Authorization", token)
                .body(payload.toJSONString())
                .post("/api/v1/teams?companyId=" +companyId)
                .then()
                .log().body()
                .statusCode(200)
                .extract()
                .response();

        JsonPath responseParsed = response.jsonPath();
        teamId = responseParsed.getString("newTeam._id");
        System.out.println(teamId);
        boardId = responseParsed.getString("newTeam.boards[0]");
        System.out.println(boardId);
    }
    @Test(priority = 3)
    public void CreateList() {
        //JSONObject payload = new JSONObject();
        JSONObject selector  = new JSONObject();
        selector.put("boardId", boardId);
        JSONObject data = new JSONObject();
        String listname = "List" + rand.nextInt(1000);
        data.put("name", listname);
        payload.put("selector", selector);
        payload.put("data", data);

        Response response = given()
                .when()
                .header("Content-Type", "application/json")
                .header("Authorization", token)
                .body(payload.toJSONString())
                .post("/api/v1/lists/?companyId=" +companyId)
                .then()
                .log().body()
                .statusCode(200)
                .extract()
                .response();

        JsonPath responseParsed = response.jsonPath();
        Assert.assertEquals(responseParsed.getString("message"), "Creating list is success");

    }
    @Test (priority = 4)
    public void getlist() {
        Response response = given()
                .when()
                .header("Content-Type", "application/json")
                .header("Authorization", token)
                .body(payload.toJSONString())
                .get("/api/v1/boards/" +boardId)
                .then()
                .log().body()
                .statusCode(200)
                .extract()
                .response();


        JsonPath responseParsed = response.jsonPath();
        listId = responseParsed.getString("board.lists._id");
        System.out.println(listId);
    }
}
