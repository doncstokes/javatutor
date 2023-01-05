/*
 * The "package" is optional, but should always be used.
 * This prevents collisions of names when you integrate with other modules.
 * For example, I have a class named "Main". If I integrate your code and you
 * have a class named Main and we don't have different packages, the names
 * collide. Our different files will be competing for the same location in the
 * file system.
 */
package com.donstokes.javatutor.helloworld;

/**
 * The entry point class where execution of our program begins.
 * 
 * All code in the Java programming language must reside within a "class".
 * Many programming languages, like Python, will allow you to place an
 * executable statement anywhere in the source file.This is because languages
 * like those do not enforce "object oriented" programming. 
 * 
 * It is not enforced by the Java programming language, but by convention,
 * we should capitalize the first letter of a class name. This hint makes it
 * much easier to understand the program when reading the source code.
 * 
 * Notice this comment begins with a slash and two asterisks. This is optional,
 * but can signal another tool that this comment belongs in the documentation
 * for the package. This tool is called "javadoc" and creates html pages that
 * can be used by others to understand how to use our code. The documentation
 * for this project is located in the "doc" folder. That folder contains a file
 * named "index.html". Open it with your web browser and see the generated
 * documentation.
 * 
 * @author Don Stokes
 *
 */
public class Main {
	/**
	 * The program execution starts here. It just prints a greeting.
	 * 
	 * In the Java programming language, executable statements must reside
	 * with in a "function" also known as a "method".
	 * 
	 * If a function has the special name "main" and is declared like below,
	 * it can be the starting point of execution for a Java program. Obviously,
	 * if you want to run a Java program, it must have a "main" function
	 * somewhere, even if someone else supplied it.
	 * 
	 * Notice how this function is declared "static". This indicates we do not
	 * need an instance of the class (also known as an object) to invoke the
	 * function. This makes sense when you consider that when program execution
	 * starts, there is no code to create an instance of the class, so our entry
	 * point must be "static".
	 * 
	 * @param args  Parameters that may be passed to our program from the command
	 * line. This program does nothing with command line parameters, so this
	 * parameter is ignored.
	 */
	public static void main(String[] args) {
		/*
		 * This is a call to another function. The called function is included
		 * with the Java runtime library. The purpose of this function called
		 * "println" is to display text that we pass as a parameter and leave
		 * the cursor on a new line so the next text will appear there. This
		 * function belongs to the "out" object that belongs to the "System"
		 * class. Since we are accessing something on a class and not an
		 * instance, we can deduce that "out" must be declared "static" and
		 * "public".
		 * 
		 * When you execution this program, you should see the text
		 * "Hello, World!" appear on your console. If you are launching this
		 * program from a graphical user interface, you will not see the
		 * console or this output.
		 */
		System.out.println("Hello, World!");
		
		/*
		 * Since there are no more statements in this function, execution will
		 * return back to the caller, which is the Java runtime library that
		 * you never see.
		 */
	}
}
