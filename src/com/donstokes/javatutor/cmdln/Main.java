package com.donstokes.javatutor.cmdln;

/**
 * The program execution starts here. It just prints a custom greeting.
 * 
 * The purpose of this program is to demonstrate several basic Java programming
 * concepts in addition to the ones we saw in helloworld.
 *  * Use a parameter passed to a function.
 *  * Access an array variable element.
 *  * Use a variable of type "String".
 *  * Execute a branch (conditional) statement with an "if/else".
 * 
 * We can run this program in two different ways. The first way is open a
 * command shell, navigate to the parent folder of the "com" folder where
 * all the compiled "*.class" files are generated and issue the command:
 *   java com.donstokes.javatutor.cmdln.Main YourNameHere
 * The second and easier way to run it is to package the code in a "jar" file
 * and issue the command:
 *   java -jar TheNameOfOur.jar YourNameHere
 * Most Integrated Development Environments (IDE) have a way to execute
 * programs with configurable command line parameters.
 *
 * Many of the concepts needed to understand this program were documented in
 * the helloworld package. Below, you will see a "@see" tag that puts a link
 * in the documentation to that class. Check it out!
 * 
 * @author Don Stokes
 * @see com.donstokes.javatutor.helloworld.Main
 */
public class Main {

	/**
	 * Entry point of the program.
	 * @param args  Parameter(s) from the command line.
	 *  the square brackets indicate that this is not a simple String variable,
	 *  but it is an array of String variable. An array is a variable that may
	 *  hold many values. The size of the the array is determined by the code
	 *  that created it.
	 */
	public static void main(String[] args) {
		/*
		 * The name that we print in the greeting is not constant.
		 * We are declaring a variable of type "String" (text) that will hold
		 * the name of the person we are greeting.
		 */
		String name;
		
		/*
		 * There are two use cases for this program.
		 * First use case is execution with no command line parameters.
		 * Second use case is execution with at least one command line
		 * parameter like that documented above.
		 * This conditional statement ("if") will test which use case we have
		 * and execute exactly one of the two statements.
		 * Since the bodies of the "if" and "else" only contain single
		 * statements, the curly braces are not required. Some developers feel
		 * it is best to always include them in case you want to add more
		 * statements later. It does create a longer file that spills onto
		 * more pages and is more challenging to read. This is one of those
		 * decisions made be personal taste.
		 * We determine which case we have by examining the "length" member
		 * of the "args" array object.
		 */
		if (args.length < 1) {
			/*
			 * The user supplied no parameter specifying the name for the
			 * greeting. Just address the user with a default name.
			 */
			name = "Stranger";
		} else {
			/*
			 * The user supplied at least one parameter. The first parameter is
			 * the name of the user.
			 */
			name = args[0];
		}	
		/*
		 * Assemble the text for the greeting. "name" contains the correct
		 * value computed above.
		 */
		String greeting = "Hello, " + name + "!";
		/*
		 * Display the greeting on the console.
		 */
		System.out.println(greeting);
	}
}
