package com.ExceptionHandling;

public class BatteryTemp {

	private int temp;
	private int battery;

	public BatteryTemp(int temp, int battery) {
		this.temp = temp;
		this.battery = battery;

	}

	public void BatteryTemprature() throws HighTempratureException, LowbatteryException {

		if (battery < 20 || temp > 45) {

			if (temp > 45) {

				System.out.println("Temparture is " + temp);
				throw new HighTempratureException("Too much heated");
			} else if (battery < 20) {
				System.out.println("Battey is too low :" + battery);
				throw new LowbatteryException("Battery is too low");

			}

			

		}
		else {
			System.out.println("Battery is :" + battery);
			System.out.println("Temp is :" + temp);
		}
	}

}
