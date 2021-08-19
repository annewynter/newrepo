package com.syntax.HomeWorkcl13;

public class ArrayMethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr= {10,10,10,10};
		ArrayMethod method=new ArrayMethod();
		arr=method.doubleTheArray(arr);
		
		for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		
	}

}
