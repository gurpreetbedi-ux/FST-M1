import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.HashMap;
import java.util.Map;

import org.hamcrest.Matchers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class SpecificationTest {
	RequestSpecification requestSpec;
	ResponseSpecification responseSpec;
	int petId;
	
	@BeforeMethod
	@BeforeClass
	public void setUp() {
	
		requestSpec=new RequestSpecBuilder()
					.setBaseUri("https://petstore.swagger.io/v2/")
					.addHeader("content-Type","application/json").build();
					
		
		responseSpec=new ResponseSpecBuilder()
					.expectStatusCode(200)
					.expectBody("status",Matchers.equalTo("alive")).
					expectResponseTime(Matchers.lessThanOrEqualTo(5000L)).build();
	}
	
	@Test(priority=1)
	public void postRequestTest() {
		Map<String, Object> reqBody=new HashMap<>();
		reqBody.put("id",779897);
		reqBody.put("name", "retrweq");
		reqBody.put("status", "alive");
		
		Response response=
				given().
				spec(requestSpec).body(reqBody).
				log().all().
				when().
				post("/pet");
		
		this.petId=response.then().extract().path("id");
		
		response.then().spec(responseSpec).log().all();
	}

	@Test(priority=2)
	public void getRequestTest() {
		
		given().spec(requestSpec).pathParam("petId", this.petId).
		when().get("/pet/{petId}").
		then().spec(responseSpec);
	
	}
	@Test(priority=3)
	public void deleteRequestTest() {
		given().spec(requestSpec).pathParam("petId",this.petId).
		when().delete("/pet/{petId}").
		then().statusCode(200).body("message",Matchers.equalTo(""+this.petId));
		
	}
	
	
	
}