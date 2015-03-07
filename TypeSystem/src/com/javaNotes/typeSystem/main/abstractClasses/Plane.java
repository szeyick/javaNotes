package com.javaNotes.typeSystem.main.abstractClasses;

/**
 * The {@link Plane}
 * <p>
 * This class represents the concrete implementation of
 * the abstract class {@link HornSounds}. The abstract class
 * provides default behaviour for our plane, but also forces the
 * class to implement its own start() method.
 * <p>
 * @author szeyick
 */
public class Plane extends HornSounds {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void start() {
		System.out.println("Passengers, please set all seats and tray tables in the upright position");
		System.out.println("Preparing for takeoff....");
	}

}
