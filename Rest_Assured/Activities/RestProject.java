import java.util.HashMap;

import org.hamcrest.Matchers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class RestProject<RequestSpecification, ResponseSpecification> {
    
    int keyId;
    RequestSpecification requestSpec;
    ResponseSpecification responseSpec;
    
    
    @BeforeClass
    public void setUp() {
        	requestSpec = new RequestSpecBuilder().
			setBaseUri("https://api.github.com/user/keys").
			addHeader("Content-Type", "application/json").
			addHeader("X-GitHub-Api-Version", "2022-11-28").
			build();

    	   	responseSpec = new ResponseSpecBuilder().
			expectBody("title", Matchers.equalTo("TestKey")).
			expectBody("key", Matchers.equalTo(sshKey)).
			expectResponseTime(Matchers.lessThanOrEqualTo(3000L)).
			build();
    }
    
    @Test(priority = 1)
    public void postRequestTest() {
    	
    	HashMap<String, String> reqBody = new HashMap<String, String>();
    	reqBody.put("title", "TestKey");
    	reqBody.put("key", sshKey);
    	
    	Response response = RestAssured.
		given().spec(requestSpec).body(reqBody).log().all().when().post();
    
    	keyId = response.then().extract().path("id");
		
    	response.then().log().all().
    		statusCode(201).
    		spec(responseSpec);
    }
    
    @Test(priority = 2)
    public void getRequestTest() {
    	// Send request, save response
    	RestAssured.given().spec(requestSpec).pathParam("keyId", keyId).
		when().get("/{keyId}").
		then().statusCode(200).spec(responseSpec);
    }
    
    @Test(priority = 3)
    public void deleteRequestTest() {
    
    	RestAssured.given().spec(requestSpec).pathParam("keyId", keyId).
		when().delete("/{keyId}").
		then().statusCode(204).time(Matchers.lessThanOrEqualTo(3000L));
    }
}














