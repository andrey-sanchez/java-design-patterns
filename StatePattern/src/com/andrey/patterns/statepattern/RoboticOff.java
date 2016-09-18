package com.andrey.patterns.statepattern;

public class RoboticOff implements RoboticState{

	private final Robot robot;
	
	public RoboticOff(Robot robot){
		this.robot = robot;
	}
	 
	@Override
	public void walk() {
		System.out.println("Walking...");
		robot.setRoboticState(robot.getRoboticOn());
	}

	@Override
	public void cook() {
		System.out.println("Cannot cook at Off state.");
	}

	@Override
	public void off() {
		System.out.println("Already switched off...");
	}
}
