package chapter2;
//: object/helloDate.java
import java.util.*;

/** The first Thinking in Java example program
 * Displays a string and today's date.
 * @author Administrator
 * @author gk
 * @version 4.0
 * @see lang
 * @param String[]
 */
public class HelloDate {
	/**
	 * Entry point to class & application
	 * @param args array of string argments
	 * @throws exception No Exception thrown
	 */
	public static void main(String[] args){
		System.out.println("Hello, it's:");
		System.out.println(new Date());
	}/* Output:
	Hello,it's:
	...
	*///:~
}
