package com.ExceptionHandling;

public class VechicleException {

	public static void main(String[] args) {

		Vechicle vechicle = new Vechicle(100);

		try {
			vechicle.SpeedLimit(120);
			
		} catch (ExceedLimitException e) {
			
			
			System.out.println(e.getMessage());
		}
      
	 finally {
    		System.out.println("car speed  cannot be more than "+vechicle.getSpeed());
	}	
	}

}
