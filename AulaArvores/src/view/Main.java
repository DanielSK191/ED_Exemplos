package view;

import javax.swing.JOptionPane;

import controller.BinaryTree;

public class Main {

	public static void main(String[] args) {
		BinaryTree arvore = new BinaryTree();
		System.out.println(arvore.isEmpty());
		arvore.inserir(arvore.raiz, 50);
		arvore.inserir(arvore.raiz, 40);
		arvore.inserir(arvore.raiz, 60);
		arvore.inserir(arvore.raiz, 35);
		arvore.inserir(arvore.raiz, 45);
		arvore.inserir(arvore.raiz, 55);
		arvore.inserir(arvore.raiz, 65);
		System.out.println(arvore.isEmpty());
		arvore.buscaValor(arvore.raiz, Integer.parseInt(JOptionPane.showInputDialog("Insira um valor inteiro a ser buscado:")));
		System.out.println(arvore.printTree(arvore.raiz));
	}

}
