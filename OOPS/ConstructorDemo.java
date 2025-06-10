package com.OOPS;


 class Vehicle {
    private int vehicleNumber;
    private String vehicleName;
    private int vehiclePrice;
   static  private String City ="Chalisgaon";
     
    public int getVehicleNumber() {
        return vehicleNumber;
    }

   

    public void setVehicleNumber(int vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public int getVehiclePrice() {
        return vehiclePrice;
    }

    public void setVehiclePrice(int vehiclePrice) {
        this.vehiclePrice = vehiclePrice;
    }
    
    
  @Override
	public String toString() {
		return "Vehicle [vehicleNumber=" + vehicleNumber + ", vehicleName=" + vehicleName + ", vehiclePrice="
				+ vehiclePrice + ", City=" + City + "]";
	}



	// Default Constructor
    public Vehicle() {
    	this.vehicleNumber = 101;
        this.vehicleName = "Audi";
        this.vehiclePrice = 100000;
    }
    // Parameterized constructor
    public Vehicle(int vehicleNumber, String vehicleName, int vehiclePrice) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleName = vehicleName;
        this.vehiclePrice = vehiclePrice;
    }
    
    // Copy Constructor
    
    public Vehicle(Vehicle vehicle) {
        this.vehicleNumber = vehicle.vehicleNumber;
        this.vehicleName = vehicle.vehicleName;
        this.vehiclePrice = vehicle.vehiclePrice;
    }
    

}

public class ConstructorDemo {

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle();
        System.out.println(v1.toString()+"\n");

        Vehicle v2 = new Vehicle(102, "BMW", 20000);
        System.out.println(v2.toString() + "\n");

        // Correct usage of the copy constructor
        Vehicle copyConsVehicle = new Vehicle(v1);
        System.out.println(copyConsVehicle.toString());
	}

}
