package com.andrey.patterns.abstractfactorypattern;

public interface AbstractParserFactory {

	public XMLParser getParserInstance(String parserType);
}
