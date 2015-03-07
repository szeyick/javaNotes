package com.javaNotes.typeSystem.main.abstractClasses;

/**
 * The {@link HornSounds}
 * <p>
 * This class represents an abstract class. An 
 * abstract class can implement functionality
 * but cannot be instantiated. Child classes must implement
 * an abstract classes abstract method, but do not need to 
 * implement their defined methods. If a child class does not
 * override a method, it will default to use the one defined
 * in this class.  
 * <p>
 * @author szeyick
 */
public abstract class HornSounds {

	/**
	 * The sound of a horn.
	 */
	public void pushHorn() {
		System.out.println("Toot toot!!");
	}
	
	/**
	 * The method that all child classes need to implement.
	 */
	public abstract void start();
}
