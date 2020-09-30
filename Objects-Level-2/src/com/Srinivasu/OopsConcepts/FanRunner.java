package com.Srinivasu.OopsConcepts;

public class FanRunner {

	public static void main(String[] args) {
	
		Fan fan = new Fan("Usha","Red",1.3256);
		fan.switchOn();
		System.out.println(fan);
		System.out.println("___________________________________________________________");
		
		fan.setSpeed((byte)3);
		System.out.println(fan);
		
		System.out.println("____________________________________________________________");
		
		fan.switchOff();
		fan.setSpeed((byte)0);
		System.out.println(fan);
		
		
	}

}
