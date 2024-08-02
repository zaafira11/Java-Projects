package com.cgday2;

public class switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char x='z';
		switch(x) {
		case 'z':
		case 'Z':
		System.out.println(x+" is a letter");
		break;
		case 'a':
		case 'A':
		System.out.println(x+" is a vowel");
		default:
			System.out.println("Not in letter");
		
		}

	}

}
