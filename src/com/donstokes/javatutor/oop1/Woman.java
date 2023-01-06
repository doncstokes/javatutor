package com.donstokes.javatutor.oop1;

import java.time.ZonedDateTime;

/**
 * Specialization class (subclass) of the superclass Human.
 * @author Don Stokes
 */
public class Woman extends Human {
	/**
	 * Constructor
	 * @param name  Name for new Human
	 * @param birth  Birth date/time for new Human
	 * @see Human
	 */
	public Woman(String name, ZonedDateTime birth) {
		/*
		 * The first executable statement of this constructor must invoke the
		 * constructor of the superclass since it must be initialized first
		 * and that cannot happen without the required parameters.
		 */
		super(name, birth);
	}

	/**
	 * Create a new instance of Man or Woman (randomly).
	 * This is a specialization that the Woman class has over the abstract
	 * Human class.
	 * @return  new instance of Man or Woman
	 */
	public Human giveBirth() {
		/*
		 * This variable will hold either a new Man or Woman instance.
		 */
		Human human;
		/*
		 * Give the new baby a birth date and time or right now.
		 */
		ZonedDateTime now = ZonedDateTime.now();
		/*
		 * Generate a random floating point number between 0.0 and 1.0.
		 */
		double random = Math.random();
		/*
		 * Instantiate either a Man or Woman with an even distribution.
		 * Use a default baby name. The user can modify it later.
		 */
		if (random < 0.5)
			human = new Woman("Baby Girl", now);
		else
			human = new Man("Baby Boy", now);

		return human;
	}
}
