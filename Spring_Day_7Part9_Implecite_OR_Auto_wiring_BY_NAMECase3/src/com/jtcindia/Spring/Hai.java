package com.jtcindia.Spring;

public class Hai {
	
	public Hai() {
	System.out.println("D.C in Hai");
	}
	Hai(String string){
		System.out.println("1 para constr in Hai");
	}
	@Override
	public String toString() {
		return "Hai [] ******";
	}
}
//Here we are specifying one constructor and one parameterise constructor