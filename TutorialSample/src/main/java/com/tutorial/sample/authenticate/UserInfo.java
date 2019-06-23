/**
 * @author Puneet Duneja
 * ©TRIOHATS Consulting Pvt Ltd
 *
 */

package com.tutorial.sample.authenticate;

/**
 * @author Puneet D
 *
 */
public class UserInfo {
	String Name;
	String DOB;
	String Country;
	
	
	public void setName(String name) {
		Name = name;
	}

	public void setDOB(String dob) {
		DOB = dob;
		
	}

	public void setCountry(String country) {
		Country = country;
		
	}

	public String getName() {
		// TODO Auto-generated method stub
		return Name;
	}

	public String getDOB() {
		// TODO Auto-generated method stub
		return DOB;
	}

	public String getCountry() {
		// TODO Auto-generated method stub
		return Country;
	}

}
