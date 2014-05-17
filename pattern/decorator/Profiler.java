package pattern.decorator;

public class Profiler implements Fibonacci {
	private Fibonacci fib;
	
	public Profiler (Fibonacci fib) {
		this.fib = fib;
	}
	
	public int recursive(int n) {
		long startTime = System.currentTimeMillis();
		int res = fib.recursive(n);
		long endTime = System.currentTimeMillis();
		System.out.println("Time: \t"+ (double)(endTime - startTime)/1000);
		return res;
	}
	
	public int iterative(int n) {
		long startTime = System.currentTimeMillis();
		int res = fib.iterative(n);
		long endTime = System.currentTimeMillis();
		System.out.println("Time: \t" + (double)(endTime - startTime)/1000);
		return res;
	}
	
	public int dynamicProgramming(int n) {
		long startTime = System.currentTimeMillis();
		int res = fib.dynamicProgramming(n);
		long endTime = System.currentTimeMillis();
		System.out.println("Time: \t" + (double)(endTime - startTime)/1000);
		return res;
	}
	
	public static void main(String[] args) {
		int NUMERO = 45;
		Profiler fib = new Profiler(new FibonacciImpl());
		System.out.println("Recursive \t" + fib.recursive(NUMERO));
		System.out.println("Iterative \t" + fib.iterative(NUMERO));
		System.out.println("Dynamic \t" + fib.dynamicProgramming(NUMERO));
	}
}
