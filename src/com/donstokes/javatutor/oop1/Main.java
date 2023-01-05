package com.donstokes.javatutor.oop1;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Entry point for the program.
 * 
 * This program and the classes in the package demonstrate many of the basic
 * concepts of Object Oriented Programming (OOP).
 * 
 * The first concept is "encapsulation". An object holds its data private and
 * only allows access to it from accessor or mutator methods, also called
 * "getters and setters". This is demonstrated in the "Human" class.
 * 
 * The second concept is "inheritance". The "Woman" class inherits features from
 * the "Human" class, including the management of a name and birth date/time.
 * 
 * The third concept is "polymorphism". All objects in Java have a "toString"
 * method that will display an object in a human readable form, even if it is
 * not very interesting. The "Human" object "overrides" that method and produces
 * a more intersting rendering as a String.
 * 
 * @author Don Stokes
 *
 */
public class Main {

	/**
	 * Entry point for program execution.
	 * @param args  (ignored)
	 */
	public static void main(String[] args) {
		/*
		 * Create an instance (object) from the Woman class named "Eve"
		 * and specify her birthday.
		 */
		Woman woman = new Woman("Eve", ZonedDateTime.parse("1994-01-19T03:00:00-05:00"));
		/*
		 * Eve gives birth to either a female or a male, so we must declare the
		 * reference using the "superclass" "Human", which can be a Man or Woman.
		 */
		Human baby  = woman.giveBirth();
		/*
		 * Determine the gender and give the baby an appropriate name. 
		 */
		if (baby instanceof Woman)
			baby.setName("Theresa");
		else
			baby.setName("John");
		/*
		 * Display an announcement of the birth that looks something like this:
		 *   Eve age 28 gave birth to John at 01/05/2023 16:19:34.
		 */
		System.out.print(woman.toString());
		System.out.print(" gave birth to ");
		System.out.print(baby.getName());
		System.out.print(" at ");
		System.out.print(baby.getBirth().toLocalDateTime().format(
			DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss")));
		System.out.println(".");
	}
}
