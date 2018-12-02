package view;

public class FibonacciIterativo {
	public static void main(String[] args) {
			System.out.println("Fibonacci de " + 5 + " é " + fibonacci(5));
		}
		public static long fibonacci(long n) {
			long i, k, F;
			i = 1;
			F = 0;
			for (k = 1; k <= n; k++) {
				F = F + i;
				i = F - i;
			}
			return F;
		}

}
