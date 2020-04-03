package restAssuredTest;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class Get_List_User {

	@Test
	public void getListUser() {
		given().when().get("https://reqres.in/api/users?page=2").then()

				.statusCode(200)
				.statusLine("HTTP/1.1 200 OK")
				.header("Content-Type", "application/json; charset=utf-8")

		.assertThat().body("total",equalTo (12))
		.log().all();

	}

}
