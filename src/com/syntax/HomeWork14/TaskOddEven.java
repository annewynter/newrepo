package com.syntax.HomeWork14;

public class TaskOddEven {

	public static void main(String[] args) {
		// Create a String and if the String is not empty perform the following: 
		//if the String has an odd number of characters 
		//and has 3 or more characters, 
		//print the character in the middle of the String.

		boolean isEven=true;
		
		String checker="Earth";
		if (checker.length()%2==0) {
	System.out.println(isEven+" "+checker.length());
	
		}else {
			System.out.println(!isEven+" "+checker.length());
		}
		System.out.println(checker.charAt(2));
		
	}

}
