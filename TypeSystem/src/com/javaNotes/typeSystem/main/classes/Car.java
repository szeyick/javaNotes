package com.javaNotes.typeSystem.main.classes;

import com.javaNotes.typeSystem.main.interfaces.IVehicle;

/**
 * The {@link Car}
 * <p>
 * This class represents the concrete implementation
 * of the {@link IVehicle} interface. As a car it
 * inherits all the methods of a vehicle and provides
 * its own implementation.
 * <p>
 * @author szeyick
 */
public class Car implements IVehicle {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getNumWheels() {
		return 4;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getNumDoors() {
		return 4;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getVehicleName() {
		return "Car";
	}
}
