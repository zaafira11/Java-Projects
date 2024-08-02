package com.cgday5;

class parent5 {
	void display() {
		System.out.println("this parent class");
	}
}
class child4 extends parent5 {
	void show() {
		System.out.println("this ch2 class");
	}
}
class child6 extends parent5 {
	void print() {
		System.out.println("this ch6 class");
	}
}

public class hierclass {
	public static void main(String arge[]) {
		child cc = new child();
		cc.display();
		 
	}

}
