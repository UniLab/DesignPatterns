package pattern.decorator;

public class FibonacciImpl implements Fibonacci {
	public int recursive(int n) {
		if (n == 0) return 0;
		if (n == 1) return 1;
		return recursive(n-1) + recursive(n-2);
	}
	
	public int iterative(int n)	{	
		int i,F_meno2=0,F_meno1=1,risultato=0; 

		if ( n<2 ) 
			risultato = n; 
		else
			for ( i=2 ; i<=n ; i++ ) {
		  
				risultato = F_meno1 + F_meno2;

				F_meno2 = F_meno1; 
				F_meno1 = risultato;
			}
		                                                                  
		return risultato; 
	}
	
	public int dynamicProgramming(int n) {
		// Pre: n > 0
		if (n < 3) return 1;
		int[][] m = {{1, 1}, {1, 0}};
		int[][] mp = matricePotenza(m, n - 1);
		return mp[0][0];
	}
	
	private int[][] matricePotenza(int[][]m, int n) {
		if (n == 1) return m;
		if (n % 2 == 0) return mul(matricePotenza(m, n / 2), matricePotenza(m, n / 2));
		return mul(mul(matricePotenza(m, n / 2), matricePotenza(m, n / 2)), m);
	}
	
	private int[][] mul(int[][]m1, int[][]m2) {
		for (int i = 0; i < m1.length; i++)
			if (m1[i].length != m2.length)
				throw new IllegalArgumentException("Matrici non moltiplicabili!");
		int[][] p = new int[m1.length][m2[0].length];
		for (int i = 0; i < p.length; i++)
			for (int j = 0; j < p[0].length; j++)
				for (int k = 0; k < m1[0].length; k++)
					p[i][j] += m1[i][k] * m2[k][j];
		return p;
	}
	
	public static void main(String[] args) {
		int NUMERO = 50;
		Fibonacci fib = new FibonacciImpl();
		System.out.println(fib.recursive(NUMERO));
		System.out.println(fib.iterative(NUMERO));
	}
}
