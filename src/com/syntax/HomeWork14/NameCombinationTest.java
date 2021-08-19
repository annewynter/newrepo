package com.syntax.HomeWork14;

import java.util.Scanner;

public class NameCombinationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NameCombination check = new NameCombination();
		Scanner scan;
		scan = new Scanner(System.in);
		System.out.println("What is the mother's first name?");
		String MotherName = scan.next();

		System.out.println("What is the father's first name?");
		String FatherName = scan.next();

		System.out.println("What is the gender of child?");
		String childGender = scan.next();
		
		System.out.println("Your child suggested name is "+check.parents(MotherName, FatherName, childGender));
	}

}
