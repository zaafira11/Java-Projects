package com.cgday5;
class grandparent{
	public void family() {
		System.out.println("multi");
	}
}
class parent extends grandparent{
	public void subfam() {
		System.out.println("multilevel");
	}
}
class child extends parent{
	public void display() {
		System.out.println("multilevel");
	}
}
public class multilevelinherit {
 
}
