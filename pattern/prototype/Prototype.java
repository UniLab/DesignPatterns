package pattern.prototype; 

import pattern.decorator.FibonacciImpl;

import java.lang.*;
import java.util.*;

public class Prototype implements Cloneable { 
	
	private LinkedList<Integer> list = new LinkedList<Integer>() {{
		for (int i = 0; i < 3; i++)
			add(new FibonacciImpl().dynamicProgramming(23));
	}};
	
	@SuppressWarnings("unchecked")
	public Object clone() {
		// deep copy
		try {
			Prototype copy = (Prototype) super.clone();
			copy.list = (LinkedList<Integer>) list.clone();
			return copy;
		}
		catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}
}
