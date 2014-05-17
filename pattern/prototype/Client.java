package pattern.prototype;

import java.util.*;

public class Client {
	private static final int NUMBER = 1000000;
	public static void main(String[] args) {
		Prototype prot = new CloneableFactorial();
		long startTime = System.currentTimeMillis();
		for(int i = 0; i < NUMBER; i++) {
			CloneableFactorial clone = (CloneableFactorial) prot.clone();
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Cloned " + NUMBER + " Object\tTime: "+ (double)(endTime - startTime)/1000);
		startTime = System.currentTimeMillis();
		for(int i = 0; i < NUMBER; i++) {
			new CloneableFactorial();
		}
		endTime = System.currentTimeMillis();
		System.out.println("Created " + NUMBER + " Object\tTime: "+ (double)(endTime - startTime)/1000);
	}
}

/**
*	Secondo voi quando conviene clonare invece di istanziare? 
*	Questo esempio dovrebbe farlo capire. 
*/
