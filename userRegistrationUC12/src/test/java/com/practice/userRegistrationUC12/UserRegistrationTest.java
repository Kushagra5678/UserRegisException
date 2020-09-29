package com.practice.userRegistrationUC12;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserRegistrationTest {
	public static UserRegistration ur=null;
	@Before
	   public void before() {
		   ur=new UserRegistration();
	   }
	@Test
	public void TestFirstName_trueCase() {
		try {
			boolean result = ur.validateFirstName("Sunny");
			assertTrue(result);
		}
		catch(InvalidInputException e) {
			System.out.println(e.type);
			System.out.println(e.getMessage());
		}
	}
	@Test
	public void TestFirstName_falseCase() {
		try {
			boolean result = ur.validateFirstName("sunny");
			assertFalse(result);
		}
		catch(InvalidInputException e) {
			System.out.println(e.type);
			System.out.println(e.getMessage());
		}
	}
	@Test
	public void TestLastName_trueCase() {
		try {
			boolean result = ur.validateLastName("Agg");
			assertTrue(result);
		}
		catch(InvalidInputException e) {
			System.out.println(e.type);
			System.out.println(e.getMessage());
		}
	}
	@Test
	public void TestLastName_falseCase() {
		try {
			boolean result = ur.validateLastName("agg");
			assertFalse(result);
		}
		catch(InvalidInputException e) {
			System.out.println(e.type);
			System.out.println(e.getMessage());
		}
	}
	@Test
	public void TestEmail_trueCase() {
		try {
			boolean result = ur.validateEmail("abc@gmail.com");
			assertTrue(result);
		}
		catch(InvalidInputException e) {
			System.out.println(e.type);
			System.out.println(e.getMessage());
		}
	}
	@Test
	public void TestEmail_falseCase() {
		try {
			boolean result = ur.validateEmail("abc.gmail.com");
			assertFalse(result);
		}
		catch(InvalidInputException e) {
			System.out.println(e.type);
			System.out.println(e.getMessage());
		}
	}
	@Test
	public void TestPhoneNumber_trueCase() {
		try {
			boolean result = ur.validatePhoneNumber("919876543456");
			assertTrue(result);
		}
		catch(InvalidInputException e) {
			System.out.println(e.type);
			System.out.println(e.getMessage());
		}
	}
	@Test
	public void TestPhoneNumber_falseCase() {
		try {
			boolean result = ur.validatePhoneNumber("9198765434");
			assertFalse(result);
		}
		catch(InvalidInputException e) {
			System.out.println(e.type);
			System.out.println(e.getMessage());
		}
	}
	@Test
	public void TestPassword_trueCase() {
		try {
		boolean result = ur.validatePassword("Boo9@123467");
		assertTrue(result);
		}
		catch(InvalidInputException e) {
			System.out.println(e.type);
			System.out.println(e.getMessage());
		}
	}
	@Test
	public void TestPassword_falseCase() {
		try {
			boolean result = ur.validatePassword("Boo9123467");
			assertFalse(result);
		}
		catch(InvalidInputException e) {
			System.out.println(e.type);
			System.out.println(e.getMessage());
		}
	}
}
