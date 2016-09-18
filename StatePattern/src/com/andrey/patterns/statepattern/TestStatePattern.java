package com.andrey.patterns.statepattern;

public class TestStatePattern {

	public static void main(String[] args) {
		Robot robot = new Robot();
		robot.walk();
		robot.cook();
		robot.walk();
		robot.off();
		
		robot.walk();
		robot.off();
		robot.cook();

	}

}
