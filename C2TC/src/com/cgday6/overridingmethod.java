package com.cgday6;

public class overridingmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rbi r;
		Hdfc j;
		indianbank k;
		
		r=new Rbi();
		r.rateofinterest();
		r=new Hdfc();
		r.rateofinterest();
		r=new indianbank();
		r.rateofinterest();
		j=new Hdfc();
		j.rateofinterest();
		k=new indianbank();
		k.rateofinterest();
		

	}

}
