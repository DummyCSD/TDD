package com.tutorial.sample.authenticate;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class MyTestService {
	
	Employee refEmployee;
	AuthenticationServiceImpl employeeServiceRef;
	DAOImpl refDAO;
	Employee storedEmployeeInfo;
	
	@Before
	public void setUp(){
		// UI Input Mock
		refEmployee = new Employee();
		refEmployee.setName("Sachin");
		refEmployee.setPassword("Sachin123");		
	}

	private void TestCaseGenerator(String name, String password) {
		// THis is from DB . 
		System.out.println("TestCaseGenerator:: " + name + "   " + password);

		storedEmployeeInfo = new Employee();
		storedEmployeeInfo.setName(name);
		storedEmployeeInfo.setPassword(password);
	}
	
	private void createMock(){
		refDAO = mock(DAOImpl.class);
		when(refDAO.getUser_byName()).thenReturn((Employee) storedEmployeeInfo);
	}
	
	@After
	public void freeMemory(){
		refEmployee = null;
		employeeServiceRef = null;
		storedEmployeeInfo = null;
	}
	
	@Test
	public void myTestCaseAuthenticate(){
		System.out.println("myTestCaseAuthenticate");
		TestCaseGenerator("Sachin","Sachin123");
		boolean expectedStatus = true;
		boolean actualValue;
		createMock();
		employeeServiceRef = new AuthenticationServiceImpl(refDAO);
		actualValue = employeeServiceRef.myAuthLogic(refEmployee);
		System.out.println("Actual Status-" +actualValue);
		System.out.println("Expected Status-" +expectedStatus);
		System.out.println("End of Test");
		Mockito.verify(refDAO).getUser_byName();
		assertEquals(expectedStatus,actualValue);
		
	}
	@Test
	public void myTestCaseAuthenticateFailureScenario(){
		System.out.println("myTestCaseAuthenticateFailureScenario");	
		TestCaseGenerator("Sachin","Sachin124");
		boolean expectedStatus = false;
		boolean actualValue;
		createMock();
		employeeServiceRef = new AuthenticationServiceImpl(refDAO);
		actualValue = employeeServiceRef.myAuthLogic(refEmployee);
		System.out.println("Actual Status-" +actualValue);
		System.out.println("Expected Status-" +expectedStatus);
		System.out.println("End of Test");
		Mockito.verify(refDAO).getUser_byName();
		assertEquals(expectedStatus,actualValue);
		
	}
	
	@Test
	public void myTestCaseAuthenticateEmptyScenario(){
		System.out.println("myTestCaseAuthenticateEmptyScenario");
		TestCaseGenerator("","");
		boolean expectedStatus = false;
		boolean actualValue;
		createMock();
		employeeServiceRef = new AuthenticationServiceImpl(refDAO);
		actualValue = employeeServiceRef.myAuthLogic(refEmployee);
		System.out.println("Actual Status-" +actualValue);
		System.out.println("Expected Status-" +expectedStatus);
		System.out.println("End of Test");
		Mockito.verify(refDAO).getUser_byName();
		assertEquals(expectedStatus,actualValue);
		
	}
	
	@Test (expected=NullPointerException.class)
	public void myTestCaseAuthenticateNullScenario()throws Exception{
		
		System.out.println("null Cast :: " + (String) null);
		System.out.println("myTestCaseAuthenticateNullScenario");
		TestCaseGenerator(null,null);
		boolean expectedStatus = false;
		boolean actualValue;
		createMock();
		employeeServiceRef = new AuthenticationServiceImpl(refDAO);
		actualValue = employeeServiceRef.myAuthLogic(refEmployee);
		System.out.println("Actual Status-" +actualValue);
		System.out.println("Expected Status-" +expectedStatus);
		System.out.println("End of Test");
		Mockito.verify(refDAO).getUser_byName();
		assertEquals(expectedStatus,actualValue);
		
	}
}
