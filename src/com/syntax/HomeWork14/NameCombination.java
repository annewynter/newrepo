package com.syntax.HomeWork14;

public class NameCombination {

		// Write a program that reads two people's first
		// names and if they expecting boy or girl?
		// Based on the input suggests a name for a baby:
		// Example Output:
		// Mom’s first name? Mary
		// Dad’s first name? Daniel
		// Boy or Girl? boy
		// Suggested baby name: DANRY
	
	String parents(String mother, String father, String kidgender) {
	String kidname = "";
		if (kidgender.equalsIgnoreCase("boy")) {
		kidname=father.substring(father.length()/2).concat(mother.substring(mother.length()/2));
			
		
		}else if(kidgender.equalsIgnoreCase("girl")) {
			kidname=mother.substring(mother.length()/2).concat(father.substring(father.length()/2));
		}else {
			System.out.println("wrong input");
		}
		

		
		return kidname;
	}
	}
	

	


