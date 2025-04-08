package apiTesting;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class postMethod {
    @Test
    public void createUsers(){
        RestAssured.baseURI = "https://reqres.in/";
        Map<String,String> bodyData = new HashMap<String , String>();
        bodyData.put("name", "hamad");
        bodyData.put("job", "testing");
        Response response = given().when().body(bodyData).post("api/users");
        response.prettyPrint();
}
}
