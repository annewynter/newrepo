package com.syntax.HomeWorkcl13;

public class Student {

	int score;
	char grade;
	
	{
		if(score>90) {
			grade='A';
		
		}else if (score>=80 || score <90) {
			grade='B';
		}else if (score >=70 || score <80) {
			grade ='C';
		}else if (score>=50 || score<70 ) {
			grade='D';
		}else {
			grade='F';
		}
		
		
		}
	void getGrade(){
		System.out.println(score+" "+" is "+grade);

	}
	
}
