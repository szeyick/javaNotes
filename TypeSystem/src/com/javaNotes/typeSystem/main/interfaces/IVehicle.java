package com.javaNotes.typeSystem.main.interfaces;

/**
 * The {@link IVehicle}
 * <p>
 * This class represents an interface. The 
 * interface defines the methods that all
 * inheriting classes must implement.
 * </p>
 * <p>
 * For a vehicle, we define all common features
 * that all vehicles have, which they must 
 * separately implement.
 * </p>
 * @author szeyick
 */
public interface IVehicle {

	/**
	 * @return - The number of wheels the vehicle has.
	 */
	public int getNumWheels();
	
	/**
	 * @return - The number of doors the vehicle has.
	 */
	public int getNumDoors();
	
	/**
	 * @return - The name of the vehicle.
	 */
	public String getVehicleName();
}
