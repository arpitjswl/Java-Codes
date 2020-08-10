package com.patterns.factory;

public  class ObjectsFactoy {
	public OS getObject(String name) {
		if (name.equalsIgnoreCase("linux"))
			return new Linux();
		else if (name.equalsIgnoreCase("windows"))
			return new Windows();
		else if(name.equalsIgnoreCase("ios"))
			return new IOS();
		return null;
	}
}	
