package array;
	
	interface Vehicle {
	    void start();
	    void stop();
	}

	
	interface LandVehicle extends Vehicle {
	    void drive();
	}

	
	interface SeaVehicle extends Vehicle {
	    void floatOnWater();
	}

	class Car implements LandVehicle {
	    public void start() {
	        System.out.println("Car starting...");
	    }
	    
	    public void stop() {
	        System.out.println("Car stopping...");
	    }
	    
	    public void drive() {
	        System.out.println("Car driving on the road.");
	    }
	}

	
	class Bicycle implements LandVehicle {
	    public void start() {
	        System.out.println("Bicycle starting...");
	    }
	    
	    public void stop() {
	        System.out.println("Bicycle stopping...");
	    }
	    
	    public void drive() {
	        System.out.println("Bicycle pedaling on the road.");
	    }
	}

	
	class Ship implements SeaVehicle {
	    public void start() {
	        System.out.println("Ship starting engines...");
	    }
	    
	    public void stop() {
	        System.out.println("Ship stopping engines...");
	    }
	    
	    public void floatOnWater() {
	        System.out.println("Ship floating on the water.");
	    }
	}

	// Implement the SeaVehicle interface with Submarine class
	class Submarine implements SeaVehicle {
	    public void start() {
	        System.out.println("Submarine starting...");
	    }
	    
	    public void stop() {
	        System.out.println("Submarine stopping...");
	    }
	    
	    public void floatOnWater() {
	        System.out.println("Submarine submerging in water.");
	    }
	}

	public class Main2 {
	    public static void main(String[] args) {
	        // Test Car
	        System.out.println("Testing Car:");
	        Car car = new Car();
	        car.start();
	        car.drive();
	        car.stop();
	        System.out.println();
	        
	        // Test Bicycle
	        System.out.println("Testing Bicycle:");
	        Bicycle bicycle = new Bicycle();
	        bicycle.start();
	        bicycle.drive();
	        bicycle.stop();
	        System.out.println();
	        
	        // Test Ship
	        System.out.println("Testing Ship:");
	        Ship ship = new Ship();
	        ship.start();
	        ship.floatOnWater();
	        ship.stop();
	        System.out.println();
	        
	        // Test Submarine
	        System.out.println("Testing Submarine:");
	        Submarine submarine = new Submarine();
	        submarine.start();
	        submarine.floatOnWater();
	        submarine.stop();
	    }
	}

