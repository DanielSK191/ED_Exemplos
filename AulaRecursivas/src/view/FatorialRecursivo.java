package view;

import javax.swing.JOptionPane;

public class FatorialRecursivo {
		public static void main(String[] args){
			int x = Integer.parseInt(JOptionPane.showInputDialog
					("Insira um valor para ser calculado: "));	
			System.out.println("Fatorial de "+ x + " é " + fatorial(x));
		}
		public static long fatorial(long n) {
			if (n == 0 ) return 1; //condição de parada
			else return n * fatorial(n - 1);
		}
}


