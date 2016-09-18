package com.andrey.patterns.singletonpattern;

public class SingletonEager {
	private static SingletonEager sc = new SingletonEager();
	private SingletonEager(){}
	public static SingletonEager getInstance(){
		return sc;
	}
}

