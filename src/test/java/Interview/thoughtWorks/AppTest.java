package Interview.thoughtWorks;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import io.restassured.RestAssured.*;
//import static org.junit.Assert.assertTrue;
//import org.junit.Test;

public class AppTest
{
	@Test
	public void shouldAnswerWithTrue()
	{
		System.out.println("Welcome REST Assured");
		assertTrue(true);
	}
}
