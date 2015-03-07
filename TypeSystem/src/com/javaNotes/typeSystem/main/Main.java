package com.javaNotes.typeSystem.main;

import com.javaNotes.typeSystem.main.abstractClasses.Boat;
import com.javaNotes.typeSystem.main.abstractClasses.HornSounds;
import com.javaNotes.typeSystem.main.abstractClasses.Plane;
import com.javaNotes.typeSystem.main.classes.Car;
import com.javaNotes.typeSystem.main.classes.Truck;
import com.javaNotes.typeSystem.main.interfaces.IVehicle;

/**
 * The {@link Main}
 * <p>
 * This program main creates a simple program
 * that demonstrates classes, objects, interfaces
 * and an abstract class.
 * <p>
 * @author szeyick
 */
public class Main {

	/**
	 * The program main.
	 * @param args - Command line arguments.
	 */
	public static void main(String[] args) {
		IVehicle truck = new Truck();
		IVehicle car = new Car();
		
		printVehicleInformation(truck);
		printVehicleInformation(car);
		
		// Declare the boat and plane classes that extend the abstract class.
		Boat boat = new Boat();
		Plane plane = new Plane();
		
		printHornSounds(boat);
		printHornSounds(plane);
	}
	
	/**
	 * Print the information for the abstract vehicles. We can also refer to
	 * our new vehicles through their common abstract interface.
	 * @param vehicleSounds - The vehicles referenced by the abstract type.
	 */
	private static void printHornSounds(HornSounds vehicleSounds) {
		vehicleSounds.pushHorn();
		vehicleSounds.start();
		System.out.println();
	}
	/**
	 * Print the information for a vehicle. 
	 * @param vehicle - The vehicle to print data for.
	 */
	private static void printVehicleInformation(IVehicle vehicle) {
		// Because we refer to the object through its interface we can
		// generically refer to any IVehicle object (car, truck) without
		// referencing the exact type of the vehicle.
		System.out.println("Hello I am a " + vehicle.getVehicleName());
		System.out.println("I have " + vehicle.getNumWheels() + " wheels");
		System.out.println("And I have " + vehicle.getNumDoors() + " doors");
		System.out.println();
	}

}
