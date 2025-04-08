package apiTesting;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class deleteMethod {
    @Test
    public void DeleteUser(){
        RestAssured.baseURI = "https://reqres.in/";
        Map<String,String> bodyData = new HashMap<String , String>();
        Response response = given().when().delete("api/users/2"); // replace the id with lets one
        response.prettyPrint();
        System.out.println(response.statusCode());
        System.out.println(response.statusLine());
    }
}
