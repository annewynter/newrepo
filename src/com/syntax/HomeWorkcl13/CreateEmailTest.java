package com.syntax.HomeWorkcl13;

public class CreateEmailTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CreateEmail method=new CreateEmail();
		String name=method.input1("Anne");
		String lastName=method.input2("Wynter");
		String email=method.input3("@gmail.com");
	
		System.out.println(name+lastName+email);

	}
	
}

