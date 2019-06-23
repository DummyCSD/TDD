/**
 * @author Puneet Duneja
 * ©TRIOHATS Consulting Pvt Ltd
 *
 */

package com.tutorial.hr.finance;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author HP
 *
 */
public class EmployeeFinanceServiceTest {
	
	EmployeeFinanceService empFS;
	@Before
	public void setUp(){
		empFS= new EmployeeFinanceService();
	}
	
	@After
	public void tearDown(){
		
	}
	
	//Setting the expections and drive implementation based
	//on the expectations
	//PF is calculated for all employees
	
	//formula : PF = 12% (Basic pay)
	
	//if (grossSalary > 10000) then Basic pay = 40% of (Gross Salary)
	//else Basic pay = 20% of gross salary
	//null should not be supported as monthly grossSalary
	
	@Test
	public void calculatePF(){
		
		
		int grossSalary = 12000;
		double basicPay = (0.4*grossSalary);
		//System.out.println("the Basic is "+basicPay);
		double expectedPFValue = (0.12*basicPay);
		System.out.println("Unit Test : expected value of the PF is "+expectedPFValue);
		assertEquals(expectedPFValue,empFS.getPF(grossSalary));
		
		
	}
	//gross < 10000
	@Test
	public void calculatePF_lessThan10000(){
		
		
		int grossSalary = 8000;
		double basicPay = (0.2*grossSalary);
		//System.out.println("the Basic is "+basicPay);
		double expectedPFValue = (0.12*basicPay);
		System.out.println("Unit Test : expected value of the PF is "+expectedPFValue);
		assertEquals(expectedPFValue,empFS.getPF(grossSalary));
		
		
	}
	
	//gross 0 per month
	@Test
	public void calculatePF_grossSalary0(){
			
		double PF = 0;
		System.out.println("Unit Test : expected value of the PF is "+PF);
		assertEquals(PF,empFS.getPF(0));
					
	}
	
	//gross <0 per month
	@Test
	public void calculatePF_grossSalary_Negative(){
		double PF = 0;
		int grossSalary=-1000;
		assertEquals(PF, empFS.getPF(grossSalary));
	}
	
	/*@Test(expected=NullPointerException.class)
	public void calculatePF_grossSalary_Null(){
		empFS.getPF(null);
	}*/
	
	
	//There is demand from the employees that 
	//they should be allowed loan against their PF
	//there should be facility to see how much loan is allowed
	//and avail it .. loan amount is 50% of the PF 
	//This is exsercise for the team
	@Test
	public void isLoanAllowed(){
		
	}

}
