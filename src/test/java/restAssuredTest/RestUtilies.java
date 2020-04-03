package restAssuredTest;

import org.apache.commons.lang3.RandomStringUtils;

public class RestUtilies {

	public static String getFirstName() {
		String generatedString = RandomStringUtils.randomAlphabetic(1);
		return ("John" + generatedString);

	}

	public static String getLastName() {

		String generatedString = RandomStringUtils.randomAlphabetic(1);
		return ("Kennedy" + generatedString);

	}

	public static String getUserName() {

		String generatedString = RandomStringUtils.randomAlphabetic(3);
		return ("Kennedy" + generatedString);

	}
	
	public static String getPassWord() {

		String generatedString = RandomStringUtils.randomAlphabetic(3);
		return ("Kennedy" + generatedString);

	}
	
	public static String getEmail() {

		String generatedString = RandomStringUtils.randomAlphabetic(3);
		return ("Kennedy" + generatedString);

	}
	
	public static String EmployeeSalary() {

		String generatedString = RandomStringUtils.randomNumeric(5);
		return (generatedString);

	}
	
	public static String EmployeeAge() {

		String generatedString = RandomStringUtils.randomNumeric(2);
		return (generatedString);

	}
	
	public static String EmployeeName() {

		String generatedString = RandomStringUtils.randomAlphabetic(5);
		return ("Kennedy" + generatedString);

	}

}
