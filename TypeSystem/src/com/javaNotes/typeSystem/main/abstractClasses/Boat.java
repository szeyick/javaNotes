package com.javaNotes.typeSystem.main.abstractClasses;

/**
 * The {@link Boat}
 * <p>
 * This class represents the concrete implementation of
 * the abstract class {@link HornSounds}. The abstract class
 * provides default behaviour for our boat, but also forces the
 * class to implement its own start() method.
 * <p>
 * @author szeyick
 */
public class Boat extends HornSounds {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void start() {
		System.out.println("Starting my boat....");
		System.out.println("ALL ABOARD!!!!");
	}
}
