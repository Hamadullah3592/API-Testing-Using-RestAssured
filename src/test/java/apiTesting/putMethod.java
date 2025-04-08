package apiTesting;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class putMethod {
    @Test
    public void createUsers(){
        RestAssured.baseURI = "https://reqres.in/";
        Map<String,String> bodyData = new HashMap<String , String>(); //
        bodyData.put("name", "hamad");
        bodyData.put("job", "testing");
        Response response = given().when().body(bodyData).post("api/users");
        response.prettyPrint();
        System.out.println(response.statusCode());
        System.out.println(response.statusLine());
    }
    ////First execute post method then copy the ID from response then update the record and execute UpdateUser testcase method
    @Test
    public void UpdateUser(){
        RestAssured.baseURI = "https://reqres.in/";
        Map<String,String> bodyData = new HashMap<String , String>(); //
        bodyData.put("name", "hamad");
        bodyData.put("job", "Automation");
        Response response = given().when().body(bodyData).put("api/users/674");
        response.prettyPrint();
        System.out.println(response.statusCode());
        System.out.println(response.statusLine());
    }
}
