package com.tutorial.sample.authenticate;

public class AuthenticationServiceImpl {
	
	DAOImpl loRefDAO;
	
	public AuthenticationServiceImpl(DAOImpl refDAO) {
		loRefDAO = refDAO;
	}


	
	public boolean myAuthLogic(Employee refEmployee) {
		
		// UII INput 
		Employee loEmployee = (Employee)loRefDAO.getUser_byName();
//		if (loEmployee.getName() == null && loEmployee.getPassword() == null) {
//			return false;
//		}
		System.out.println(loEmployee.getName().toString() + " - " + loEmployee.getPassword() );
		if(refEmployee.getName().equals(loEmployee.getName()) &&
				refEmployee.getPassword().equals(loEmployee.getPassword())	){
			return true;
		};
		return false;
		
		
		
		
	}

}
