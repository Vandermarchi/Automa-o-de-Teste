package Rest;

import java.awt.event.ContainerListener;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ser.ContainerSerializer;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class GetRequest {
	
	
	@Test
	public void testYaman() {
		
		RestAssured.baseURI = "https://api.trello.com/1/actions/592f11060f95a3d3d46a987a";
		RestAssured.given().when().then().log().all().statusCode(200);
		
		Response response = RestAssured.given().when().get();
		String name = response.getBody().asString();
		
		
		Assert.assertTrue(name.contains("Professional"));
		
			
		
		
	}

}
