package com.DemoOfInheritance;


public class InheritanceDemo {
	
  
	public static void main(String[] args) {
		
		// Single Inheritance 
		Car car = new Car();
		car.setVechicleId(101);
		car.setVechiclelName("Polo");
		car.setCarCapacity(4);
		car.setCarPrice(2000000);
		
		System.out.println("----Car Details----");
		System.out.println("Car Id : "+car.getVechicleId());
		System.out.println("Car Name : "+car.getVechiclelName());
		System.out.println("Car Capacity : "+car.getCarCapacity());
		System.out.println("Car Price : "+car.getCarPrice());
		
		
		
	  System.out.println("------------- End of Car deatils -----------");
	  System.out.println("\n------------- SportCar Details -----------\n");
	  
	  // Multilevel Inheritance
	  SportCars sportCars = new SportCars();
	  
	  sportCars.setVechicleId(1001);
	  sportCars.setVechiclelName("Farari");
	  sportCars.setCarCapacity(5);
	  sportCars.setCarPrice(5000000);
	  sportCars.setHorspower(1000);
	  sportCars.setAirBag(5);
	  
	  
	  
	  System.out.println("sport car Id : "+ sportCars.getVechicleId());
	  System.out.println("sport car Name : "+ sportCars.getVechiclelName());
	  System.out.println("sport car capacity : "+ sportCars.getCarCapacity());
	  System.out.println("sport car price : "+ sportCars.getCarPrice());
	  System.out.println("sport car horspower : "+ sportCars.getHorspower());
	  System.out.println("sport car Airbag : "+ sportCars.getAirBag());
	  

	  System.out.println("------------- End of SportsCar Details -----------");
	  
	  System.out.println("\n------------- Bike Details -----------\n");
	  
	// Hierarchical Inheritance 
	  
	  Bike bike = new Bike();
	  Bike bike2 = new Bike();
	  
	  bike.setVechicleId(1);
	  bike.setVechiclelName("Shine");
	  bike.setBikeModel("Petrol");
	  
	  bike2.setVechicleId(2);
	  bike2.setVechiclelName("Bullet");
	  bike2.setBikeModel("Petrol");
	  
	  System.out.println("Bike Id: "+bike.getVechicleId());
	  System.out.println("Bike Name: "+bike.getVechiclelName());
	  System.out.println("Bike model : "+bike.getBikeModel());
	  
	  System.out.println("\n---------------------\n");
	  System.out.println("Bike Id: "+bike2.getVechicleId());
	  System.out.println("Bike Name: "+bike2.getVechiclelName());
	  System.out.println("Bike model : "+bike2.getBikeModel());
}
	}
