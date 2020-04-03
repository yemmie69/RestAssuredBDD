package restAssuredTest;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo1_Get_Request {

	@Test
	public void getWeatherDetails() {
		
		given()
		.when()
		.get("http://restapi.demoqa.com/utilities/weather/city/Lagos")
		.then()
		.statusCode(200)
		.statusLine("HTTP/1.1 200 OK")
		.assertThat().body("City",equalTo ("Lagos"))
		.assertThat().body("WeatherDescription", equalTo ("broken clouds"))
		//.header("", "");
		.assertThat().body("WindSpeed", equalTo ("4.1 Km per hour"));
		
	}
	@Test
	public void getWeather() {
		String body = get("http://restapi.demoqa.com/utilities/weather/city/Lagos").asString();
		System.out.println("This is the body " + body);

		int statusCode = get("http://restapi.demoqa.com/utilities/weather/city/Lagos").getStatusCode();
		System.out.println("The status is " + statusCode);

		String statusline = get("http://restapi.demoqa.com/utilities/weather/city/Lagos").statusLine();
		System.out.println("The statusline is " + statusline);

		String assertCity = get("http://restapi.demoqa.com/utilities/weather/city/Lagos").body().path("City", "Lagos");
		Assert.assertEquals(assertCity, "Lagos");
		
		String assertTemperature = get("http://restapi.demoqa.com/utilities/weather/city/Lagos").body().path("Temperature", "29 Degree celsius");
		Assert.assertEquals(assertTemperature, "29 Degree celsius");
		System.out.println("The temp is " + assertTemperature);
		
		String Humidity = get("http://restapi.demoqa.com/utilities/weather/city/Lagos").body().path("Humidity", "74 Percent");
		Assert.assertEquals(Humidity, "74 Percent");

	}
	
	@Test
	public void getEmployee() {
		given()
		.when()
		.get("http://restapi.demoqa.com/utilities/weather/city/Hyderabad")
		.then()
		.log().body()
		.statusCode(200)
		.statusLine("HTTP/1.1 200 OK")
		.body("City.", equalTo ("Hyderabad"));

	}

	
	
	@Test
	public void putEmployee() {
		HashMap body = new HashMap();
		body.put("name", "tom");
		body.put("salary", "200");
		body.put("age", "67");

	


		given()
		.contentType("application/json")
		.body(body)
		
		.when()
		.put("http://dummy.restapiexample.com/api/v1/update/15410")
		
		.then()
		.log().body()
.statusCode(200);
		
	}
	
	@Test
	public void deleteEmployee() {
		given()
		
		.when()
		.delete("http://dummy.restapiexample.com/delete/15410")
		
		.then()
		.header("Server", "nginx/1.16.0")
		.time(lessThan(2L), TimeUnit.SECONDS)
		.cookie("ezoadgid_133674")
		
		
	
		.statusCode(404);
	}

}
