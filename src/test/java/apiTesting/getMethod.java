package apiTesting;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class getMethod {
    @Test
    public void getcall(){
        RestAssured.baseURI = "https://reqres.in/";
        Response response = given().when().get("api/users/2");
        response.prettyPrint();
    }

}
