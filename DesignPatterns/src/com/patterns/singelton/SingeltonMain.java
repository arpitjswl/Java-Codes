package com.patterns.singelton;

class Singelton{
	private static Singelton singelton = null;
	String str = null;
	
	private Singelton() {
		 str = "Hello Singelton";
	}
	
	// making it synchronized so that multiple threads can't access it
	public synchronized static Singelton getInstance() {
		if (singelton == null)
			return singelton = new Singelton();
		return singelton;
	}
}

public class SingeltonMain {

	public static void main(String[] args) {
		Singelton sin = Singelton.getInstance();
		System.out.println(sin.str);
		
		Singelton sin1 = Singelton.getInstance();
		sin.str = "Changes";
		System.out.println(sin.str);

	}

}


