/**
 * 
 */
package com.tutorial.hr.finance;

/**
 * @author Puneet Duneja
 * ©TRIOHATS Consulting Pvt Ltd
 *
 */
public class EmployeeFinanceService {

	public Object getPF(int grossSalary) {
		double basicPay;
		double PF;
		
		if(grossSalary <= 0){ return 0.0;}
		
		if (grossSalary>10000){
			basicPay=grossSalary*0.4;
		}else {
			basicPay=grossSalary*0.2;
		}
		PF=0.12*basicPay;
		System.out.println("CHecking Build trigger again ...Implementation : calculated PF is checking"+PF);
		System.out.println("file changed to vaidate check in to gitHub");
		return PF;
	}

}
