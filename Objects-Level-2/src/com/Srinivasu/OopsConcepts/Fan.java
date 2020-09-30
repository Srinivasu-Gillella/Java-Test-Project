package com.Srinivasu.OopsConcepts;

public class Fan {

	// state
	private String make;
	private String color;
	private double radius;
	private boolean isOn;
	private byte speed;

	// constructer
	public Fan(String make, String color, double radius) {
		this.make = make;
		this.color = color;
		this.radius = radius;
	}

	public void setSpeed(byte speed) {
		this.speed = speed;
	}
	public void switchOn() {
		this.isOn = true;
		setSpeed((byte)5);
	}
	public void switchOff() {
		this.isOn = false;
		setSpeed((byte)0);
	}
	// behaviour

	public String toString() {
		return String.format("make - %s,color - %s,radius - %f,isON - %b,speed - %d", make, color, radius,isOn,speed);
	}

}
