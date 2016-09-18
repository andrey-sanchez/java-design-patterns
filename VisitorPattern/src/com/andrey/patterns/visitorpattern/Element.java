package com.andrey.patterns.visitorpattern;

public interface Element {
	
	public void accept(Visitor visitor);
}
