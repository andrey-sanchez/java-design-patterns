package com.andrey.patterns.singletonpattern;

public class SingletonLazy {
	
	private static SingletonLazy sc = null;
	private SingletonLazy(){}
	public static SingletonLazy getInstance(){
		if(sc==null){
			sc = new SingletonLazy();
		}
		return sc;
	}
}

