package com.syntax.HomeWorkcl13;

public class ArrayMethod {

	
	int add (int num1, int num2) {
		return num1+num2;
	}
	int [] doubleTheArray (int []arr) {
		for (int i=0; i<arr.length; i++){
			arr [i]=arr[i]*2;
		}
		return arr;
	}
}
