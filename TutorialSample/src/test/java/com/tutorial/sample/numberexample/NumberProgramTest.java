/**
 * 
 */
package com.tutorial.sample.numberexample;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Admin
 *
 */
public class NumberProgramTest {
	
	
	NumberProgram num;
	@Before 
	public void setUp(){
		
		double num1=0;
		num = new NumberProgram();
	}
	
	@After
	public void FreeUp(){
		num = null;
	}
	
	
	
	@Test
	public void greaterNumberCheckTest(){
		double expectedVal =60;
		double actualVal;
		
		actualVal = num.checkGreaterNum(60,51);
		assertEquals(expectedVal,actualVal,0);
		
		
		
	}
	@Test
	public void greaterNumberCheckTest_secondNumGr(){
		double expectedVal =60;
		double actualVal;
		
		actualVal = num.checkGreaterNum(51,60);
		assertEquals(expectedVal,actualVal,0);
		
	}
	
	
		@Test
		public void greaterNumberCheckTest_EqualNumGr(){
			double expectedVal =60;
			double actualVal;
			
			actualVal = num.checkGreaterNum(60,60);
			assertEquals(expectedVal,actualVal,0);
			
	}
		@Test
		public void greaterNumberCheckTest_negNum(){
			double expectedVal =-1;
			double actualVal;
			
			actualVal = num.checkGreaterNum(-60,-1);
			assertEquals(expectedVal,actualVal,0);
			
	}
		@SuppressWarnings("deprecation")
		@Test
		public void greaterNumberCheckTest_withInfinite(){
			double expectedVal = 0.5;
			double actualVal;
			
			actualVal = num.checkGreaterNum (0.4, 0.5);
			System.out.println(actualVal);
			System.out.println(expectedVal);
			assertEquals(expectedVal,actualVal, 0);
			
	}


}
