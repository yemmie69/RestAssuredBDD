package restAssuredTest;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

//1)Verify single content in xml response
//2)Verify multiple content in xml response
//3)Verify xml content response in one go
//4)Find value using xml xpath in xml response
//5)xpath with text() response

public class Demo5_BasicValidation_XML {
	
	//1)Verify single content in xml response

	@Test(priority=1)
	void testSingleContent() {
		
		given()
		.when()
		.get("http://thomas-bayer.com/sqlrest/CUSTOMER/15/")
		.then()
		.body("CUSTOMER.ID",equalTo("15"))
.log().all();		
	}
	
	//2)Verify MUTIPLE content in xml response

		@Test(priority=2)
		void testMultipleContent() {
			
			given()
			.when()
			.get("http://thomas-bayer.com/sqlrest/CUSTOMER/15/")
			.then()
			.body("CUSTOMER.ID",equalTo("15"))
			.body("CUSTOMER.FIRSTNAME",equalTo("Bill"))
			.body("CUSTOMER.LASTNAME",equalTo("Clancy"))
			.body("CUSTOMER.STREET",equalTo("319 Upland Pl."))
			.log().all();		
		}
		
		//3)Verify xml content response in one go

				@Test(priority=3)
				void testMultipleContentInOneGo() {
					
					given()
					.when()
					.get("http://thomas-bayer.com/sqlrest/CUSTOMER/15/")
					.then()
					.body("CUSTOMER.text()",equalTo("15BillClancy319 Upland Pl.Seattle"))
					.log().all();		

}
				
				//4)Find value using xml xpath in xml response
				@Test(priority=4)
				void testUsingXpath1() {
					
					given()
					.when()
					.get("http://thomas-bayer.com/sqlrest/CUSTOMER/15/")
					.then()
					.body(hasXPath("/CUSTOMER/FIRSTNAME",containsString("Bill")))
			.log().all();		
				}
				@Test(priority=5)
				void testUsingXpath2() {
					
					given()
					.when()
					.get("http://thomas-bayer.com/sqlrest/INVOICE/")
					.then()
					.body(hasXPath("/INVOICEList/INVOICE[text()='30']"))
			.log().all();
}
				}
