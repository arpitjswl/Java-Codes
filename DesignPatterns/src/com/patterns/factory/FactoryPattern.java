package com.patterns.factory;

public class FactoryPattern {

	public static void main(String[] args) {
	//	ObjectsFactoy factory = new ObjectsFactoy();
		OS obj = new ObjectsFactoy().getObject("linux");
		obj.spec();
	}

}
