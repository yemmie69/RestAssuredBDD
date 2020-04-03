package restAssuredTest;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;

public class Demo4_Delete_Request {

	@Test
	public void deleteEmployeeRecord() {

		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
		RestAssured.basePath = "/delete/11493";
		
		given()
		.when()
		    .delete()
		.then()
		    .statusCode(200)
		    .log().all();
		
	}
	
	

  
}
