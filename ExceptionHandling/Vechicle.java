package com.ExceptionHandling;

public class Vechicle {

	private int speed;
	private int carspeed;
	
	public Vechicle( int speed)
	{
		this.speed = speed;
	}
	
	public void SpeedLimit(int carspeed) throws ExceedLimitException {
		
		if (carspeed > speed) {
		    carspeed =	carspeed - this.speed;
		    System.out.println("Reduce  speed by " + carspeed );
			throw new ExceedLimitException("Too much speed" );	  	
			
		}	
		else {
			System.out.println("You can go now");
			System.out.println("Your car speed is :"+ carspeed);
			System.out.println("Limit is "+speed);
		}
		
	}

	public int getSpeed() {
		return speed;
	}

	public int getCarspeed() {
		return carspeed;
		
	}


	
}
