package com.donstokes.javatutor.oop1;

import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

/**
 * This class is the "base class" for the classes "Man" and "Woman".
 * Those two classes will inherit all the behavior of this class.
 * This technique is called "abstraction".
 * The class is declared as "abstract". The program would still work without
 * that, but nothing would prevent instances created of "Human", which doesn't
 * make sense. Humans are instantiated as either female or male.
 * @author Don Stokes
 */
public abstract class Human {
	/*
	 * This is a "property" of a Human that holds the name.
	 * It is declared private and users of the class can only access it via
	 * "getName" and "setName". It's not important here, but in many cases,
	 * the class may want to validate the new value and do something like
	 * limit it to a certain length.
	 */
	private String name;
	/*
	 * This is the property that holds the birth date and time of the Human.
	 * This data type also records the time zone so that the display of the
	 * time is adjusted to compensate for different time zones.
	 * @see Human.setName
	 * @see Human.getName
	 */
	private ZonedDateTime birth;

	/**
	 * Constructor. Create a new instance of Human with specified parameters.
	 * @param name   Name for the Human
	 * @param birth  Birth date and time for the Human
	 */
	public Human(String name, ZonedDateTime birth) {
		/*
		 * Notice that the parameter names are the same as member names.
		 * This is why we need to distinguish between the two using the "this."
		 * notation. We could have avoided this by using different names for
		 * the parameters, but this technique can imply that the parameter we
		 * are passing in will be used to initialize the member with the same
		 * name.
		 */
		this.name = name;
		this.birth = birth;
	}

	/**
	 * Accessor method for the "name" property
	 * @return  Current value for the "name" property
	 * @see setName
	 */
	public String getName() {
		return name;
	}

	/**
	 * Mutator method for the "name" property
	 * @param name  New value for the "name" property
	 * @see getName
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Accessor method for birth property
	 * @return  birth (date, time, time zone)
	 */
	public ZonedDateTime getBirth() {
		return birth;
	}

	/**
	 * Mutator method for birth property
	 * @param birth  New value for birth property
	 */
	public void setBirth(ZonedDateTime birth) {
		this.birth = birth;
	}
	
	/**
	 * Override the default implementation.
	 * This method will return a string that looks something like this:
	 *   Eve age 28
	 * The @Override annotation is not necessary, but it can prevent an error in
	 * programming. For example, if we had mistyped the method name as "tostring",
	 * that method would be created, but it would not override the "toString"
	 * method. When we place the "@Override" annotation, the file will not compile
	 * if the method does not exist in a superclass or an interface.
	 */
	public @Override String toString() {
		return name + " age " + ChronoUnit.YEARS.between(birth, ZonedDateTime.now());
	}
}
