package view;

import javax.swing.JOptionPane;

public class FibonacciRecursivo {
	public static void main(String[] args) {
			int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor:"));
			System.out.println("Fibonacci de " + x + " � " + fibonacci(x));
		}
		public static long fibonacci(long n) {
			if(n == 0) //condi��o de parada
				return 0;
			else if (n == 1) //condi��o de parada
				return 1;
			else
				return fibonacci( n - 1 ) + fibonacci( n - 2 );
		}
}
