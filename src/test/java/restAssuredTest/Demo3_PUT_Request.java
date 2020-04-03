package restAssuredTest;

import java.util.HashMap;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Demo3_PUT_Request {
	public static HashMap map = new HashMap();

	String EmployeeName = RestUtilies.EmployeeName();
	String EmployeeAge = RestUtilies.EmployeeAge();
	String EmployeeSalary = RestUtilies.EmployeeSalary();
	int employee_id = 11254;

	@BeforeClass
	public void putData() {
		map.put("name", EmployeeName);
		map.put("age", EmployeeAge);
		map.put("salary", EmployeeSalary);

		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
		RestAssured.basePath = "/update/" + employee_id;

	}

	@Test
	public void testPUT() {
		given()
		    .contentType("application/JSON")
		    .body(map)
		.when()
		    .put()
		.then()
		    .statusCode(200)
		    .log().all();
		

	
	
	}

}
