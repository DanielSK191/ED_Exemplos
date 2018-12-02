package view;

import javax.swing.JOptionPane;

public class Fatorialiterativo {
	public static void main(String[] args) {
		int x = Integer.parseInt(JOptionPane.showInputDialog
								("Insira um valor para ser calculado:"));
		System.out.println("Fatorial de " + x + " é " + fatorial(x));
		}
		public static long fatorial(long n) {
			long i, fat;
			fat = 1;
			for ( i = 1; i <= n; i++ )
				fat = fat * i;
			return fat;
		}

}
