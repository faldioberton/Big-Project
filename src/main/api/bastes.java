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

        String token = "jwt eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyIjp7Il9pZCI6IjYzNDZjZDRiNjk5YmMwNDg3MWE3NmNjMyIsImdvb2dsZUlkIjoiMTAzNzQzNzUyNjc5NDk3MTEzNzc0IiwiZW1haWwiOiJmYWxkaW9iZXJ0b24xN0BnbWFpbC5jb20iLCJmdWxsTmFtZSI6IkZhbGRpIE9iZXJ0b24iLCJwaG90b1VybCI6Imh0dHBzOi8vbGgzLmdvb2dsZXVzZXJjb250ZW50LmNvbS9hL0FMbTV3dTIwSVJ3RFBMbkxpcnowR1FvZUxmbDlET1pVM1FyYnQ0NlBYUmQ4aVE9czk2LWMiLCJiaW8iOiIiLCJzdGF0dXMiOiIiLCJjcmVhdGVkQXQiOiIyMDIyLTEwLTEyVDE0OjIwOjU5LjA3MVoiLCJ1cGRhdGVkQXQiOiIyMDIyLTExLTI1VDE0OjQxOjAwLjc3MFoiLCJfX3YiOjAsImRlZmF1bHRDb21wYW55IjpudWxsfSwiaWF0IjoxNjcxNDU3NjI2LCJleHAiOjE2NzQwNDk2MjZ9.-DvJCwNOVw3OhjRE0oQSJaoGQEUWpMt32dMhdPCGgbU";


        Response response = given()
                .when()
                .header("Content-Type", "application/json")
                .header("Authorization", token)
                .body(payload.toJSONString())
                .post("/src/main/api/v1/teams?companyId=61eba2c85080f47b25ddc8f8")
                .then()
                .log().body()
                .statusCode(200)
                .extract()
                .response();

    }
}
