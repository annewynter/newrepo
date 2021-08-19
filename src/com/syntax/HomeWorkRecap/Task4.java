package com.syntax.HomeWorkRecap;

public class Task4 {
	
	boolean isPrime(int num) {
		if (num>1) {
			for (int i=2;i<num;i++) {
			if (num%i==0) {
				return false;
			}
		}
	}else {
			return false;
		}
		return true;
	}

}
