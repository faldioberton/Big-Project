package api;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

import static io.restassured.RestAssured.given;

public class createcompanyAPI {
    @Test(priority = 1)
    public void createCompany() {

        RestAssured.baseURI = "https://stagingapi.cicle.app";
        Random rand = new Random();
        String token = "jwt eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyIjp7ImRlZmF1bHRDb21wYW55IjpudWxsLCJfaWQiOiI2MzQ2Y2Q0YjY5OWJjMDQ4NzFhNzZjYzMiLCJnb29nbGVJZCI6IjEwMzc0Mzc1MjY3OTQ5NzExMzc3NCIsImVtYWlsIjoiZmFsZGlvYmVydG9uMTdAZ21haWwuY29tIiwiZnVsbE5hbWUiOiJGYWxkaSBPYmVydG9uIiwicGhvdG9VcmwiOiJodHRwczovL2xoMy5nb29nbGV1c2VyY29udGVudC5jb20vYS9BTG01d3UyMElSd0RQTG5MaXJ6MEdRb2VMZmw5RE9aVTNRcmJ0NDZQWFJkOGlRPXM5Ni1jIiwiYmlvIjoiIiwic3RhdHVzIjoiIiwiY29tcGFuaWVzIjpbXSwiY3JlYXRlZEF0IjoiMjAyMi0xMC0xMlQxNDoyMDo1OS4wNzFaIiwidXBkYXRlZEF0IjoiMjAyMy0wMS0xNVQwMjo0ODozNi4xMDRaIiwiX192IjowfSwiaWF0IjoxNjczNzUwOTE2LCJleHAiOjE2NzYzNDI5MTZ9.zqbagZXmrtUCjAO08Tuxh-TxgQVL_f_4gfsRSxsXBmo";
        JSONObject payload = new JSONObject();
        String companyName = "SekolahQA" + rand.nextInt(1000);
        String companyId = "";
        payload.put("name", companyName);
        payload.put("desc", "descc");


        Response response = given()
                .when()
                .header("Content-Type", "application/json")
                .header("Authorization", token)
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
    public void getCompanyName () {
        RestAssured.baseURI = "https://stagingapi.cicle.app";
        String token = "jwt eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyIjp7ImRlZmF1bHRDb21wYW55IjpudWxsLCJfaWQiOiI2MzQ2Y2Q0YjY5OWJjMDQ4NzFhNzZjYzMiLCJnb29nbGVJZCI6IjEwMzc0Mzc1MjY3OTQ5NzExMzc3NCIsImVtYWlsIjoiZmFsZGlvYmVydG9uMTdAZ21haWwuY29tIiwiZnVsbE5hbWUiOiJGYWxkaSBPYmVydG9uIiwicGhvdG9VcmwiOiJodHRwczovL2xoMy5nb29nbGV1c2VyY29udGVudC5jb20vYS9BTG01d3UyMElSd0RQTG5MaXJ6MEdRb2VMZmw5RE9aVTNRcmJ0NDZQWFJkOGlRPXM5Ni1jIiwiYmlvIjoiIiwic3RhdHVzIjoiIiwiY29tcGFuaWVzIjpbXSwiY3JlYXRlZEF0IjoiMjAyMi0xMC0xMlQxNDoyMDo1OS4wNzFaIiwidXBkYXRlZEF0IjoiMjAyMy0wMS0xNVQwMjo0ODozNi4xMDRaIiwiX192IjowfSwiaWF0IjoxNjczNzUwOTE2LCJleHAiOjE2NzYzNDI5MTZ9.zqbagZXmrtUCjAO08Tuxh-TxgQVL_f_4gfsRSxsXBmo";
        String companyName = "";
        Response response = given()
                .when()
                .header("Content-Type", "application/json")
                .header("Authorization", token)
                .get("/api/v1/companies")
                .then()
                .log().body()
                .statusCode(200)
                .extract()
                .response();

        JsonPath responseParsed = response.jsonPath();
        String responseString = responseParsed.getString("companies");
        responseString.contains(companyName);


    }
}
