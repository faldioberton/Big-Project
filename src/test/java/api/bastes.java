package api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.openqa.selenium.json.Json;

import java.util.Random;

import static io.restassured.RestAssured.given;

public class bastes {
    public static void main(String[] args) {

        RestAssured.baseURI = "https://stagingapi.cicle.app";
        Random rand = new Random();
        JSONObject payload = new JSONObject();
        payload.put("name", "team" + rand.nextInt(1000));
        payload.put("desc", "descc");
        payload.put("type", "team");

        String token = "jwt eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyIjp7ImRlZmF1bHRDb21wYW55IjpudWxsLCJfaWQiOiI2MzQ2Y2Q0YjY5OWJjMDQ4NzFhNzZjYzMiLCJnb29nbGVJZCI6IjEwMzc0Mzc1MjY3OTQ5NzExMzc3NCIsImVtYWlsIjoiZmFsZGlvYmVydG9uMTdAZ21haWwuY29tIiwiZnVsbE5hbWUiOiJGYWxkaSBPYmVydG9uIiwicGhvdG9VcmwiOiJodHRwczovL2xoMy5nb29nbGV1c2VyY29udGVudC5jb20vYS9BTG01d3UyMElSd0RQTG5MaXJ6MEdRb2VMZmw5RE9aVTNRcmJ0NDZQWFJkOGlRPXM5Ni1jIiwiYmlvIjoiIiwic3RhdHVzIjoiIiwiY29tcGFuaWVzIjpbXSwiY3JlYXRlZEF0IjoiMjAyMi0xMC0xMlQxNDoyMDo1OS4wNzFaIiwidXBkYXRlZEF0IjoiMjAyMy0wMS0wN1QwNDowNToyMy4zOTFaIiwiX192IjowfSwiaWF0IjoxNjczMDY0MzIzLCJleHAiOjE2NzU2NTYzMjN9.KsQk14V522g8LlHD9M2BSw_4wYhKdjjyMu4nY01YIrg";


        Response response = given()
                .when()
                .header("Content-Type", "application/json")
                .header("Authorization", token)
                .body(payload.toJSONString())
                .post("/api/v1/teams?companyId=61eba2c85080f47b25ddc8f8")
                .then()
                .log().body()
                .statusCode(200)
                .extract()
                .response();

    }
}
