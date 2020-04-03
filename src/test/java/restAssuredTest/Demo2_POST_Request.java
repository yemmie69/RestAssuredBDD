package restAssuredTest;

import java.util.HashMap;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static org.hamcrest.Matchers.equalTo;


public class Demo2_POST_Request {

	public static HashMap map = new HashMap();

//	@BeforeClass
//	public void postdate() {
//
//		map.put("FirstName", RestUtilies.getFirstName());
//		map.put("LastName", RestUtilies.getLastName());
//		map.put("UserName", RestUtilies.getUserName());
//		map.put("Password", RestUtilies.getPassWord());
//		map.put("Email", RestUtilies.getEmail());
//
//		RestAssured.baseURI = "http://restapi.demoqa.com/customer/register";
////		RestAssured.baseURI = "/register";
//
//	}
//
//	@Test
//	public void testPost() 
//	
//	{
//		given()
//		    .contentType("application/json")
//		    .body(map)
//		
//		.when()
//		   .post()
//		
//		
//		.then()
//		     .statusCode(201)
//		     .and()
//		     .body("SuccessCode", equalTo ("OPERATION_SUCCESS"))
//		     .and()
//		     .body("Message", equalTo("Operation completed successfully"));
//		
//		
//	}

//	@Test
//	public void post() {
//
//		RequestSpecification request = RestAssured.given();
//		request.header("Content-Type", "application/json");
//
//		JSONObject json = new JSONObject();
//
//		json.put("FirstName", "oluko");
//		json.put("LastName", "wolukoOluk");
//		json.put("UserName", "wuolukolope");
//		json.put("Password", "olukooyalope");
//		json.put("Email", "tolukoe@test.com");
//
//		request.body(json.toJSONString());
//
//		Response response = request.post("http://restapi.demoqa.com/customer/register");
//		int statusCode = response.getStatusCode();
////		Assert.assertEquals(statusCode, 201);
//		String body = request.post("http://restapi.demoqa.com/customer/register").asString();
//		System.out.println("This is the body " + body);
//
//		String body1 = request.post("http://restapi.demoqa.com/customer/register").body().path("FaultId",
//				"User already exists");
//		Assert.assertEquals(body1, "User already exists");
//		System.out.println(body1);
//		
//
//	}
	
	@Test
	public void post2() {
		HashMap data = new HashMap();
		data.put("FirstName", "kkolukoO");
		data.put("LastName", "gomoO");
		data.put("UserName", "yegmiO");
		data.put("Password", "agdebayOo");
		data.put("Email", "olguko@hoOt.com");
		
		given()
		.when()
		.post("https://reqres.in/api/users")
		.then()
		.statusCode(201)
		//.contentType("application/json")
.log().body();		

		
	}

}
