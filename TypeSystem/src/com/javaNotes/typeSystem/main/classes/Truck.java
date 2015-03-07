package com.javaNotes.typeSystem.main.classes;

import com.javaNotes.typeSystem.main.interfaces.IVehicle;

/**
 * The {@link Truck}
 * <p>
 * This class represents the concrete implementation
 * of the {@link IVehicle} interface. As a truck it
 * inherits all the methods of a vehicle and provides
 * its own implementation.
 * <p>
 * @author szeyick
 */
public class Truck implements IVehicle {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getNumWheels() {
		return 16;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getNumDoors() {
		return 2;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getVehicleName() {
		return "Truck";
	}
}
