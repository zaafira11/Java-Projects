package com.cgday2;

public class nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=18;
		int weight=50;
		if(age>=18) {
			if(weight>48) {
			System.out.println("Eligible");
		    }else {
		    	System.out.println("Not eligible");
		    }
		}else {
			System.out.println("Age must be greater than 18");
		}

	}

}
