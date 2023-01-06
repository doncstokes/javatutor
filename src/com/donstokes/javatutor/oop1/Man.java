package com.donstokes.javatutor.oop1;

import java.time.ZonedDateTime;

/**
 * Specialization class (subclass) of the superclass Human.
 * @author Don Stokes
 */
public class Man extends Human {
	/**
	 * Constructor
	 * @param name  Name for new Human
	 * @param birth  Birth date/time for new Human
	 */
	public Man(String name, ZonedDateTime birth) {
		/*
		 * The base class must be initialized before this subclass, but it
		 * requires parameters for the constructor. Pass them on.
		 * This must be the first executable statement of the subclass
		 * constructor.
		 */
		super(name, birth);
	}
}
