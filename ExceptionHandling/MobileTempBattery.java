package com.ExceptionHandling;

public class MobileTempBattery {

	public static void main(String[] args) {
		
		
		BatteryTemp batteryTemp = new BatteryTemp(25 ,100);
		
		try {
			batteryTemp.BatteryTemprature();
			
		} catch (HighTempratureException | LowbatteryException e) 
		{
			
			System.out.println(e.getMessage());
		}


	}

}
