package com.cgday7;

public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Savingamount sa =new Savingamount("Zaafi","cuddalore",101,4567);
		System.out.println(sa);
		sa.deposit(12000);
		System.out.println(sa);
		sa.withdraw(5000);
		System.out.println(sa);
		sa.withdraw(7000);
		System.out.println(sa);
		sa.deposit(5000);
		System.out.println(sa);

	}

}
