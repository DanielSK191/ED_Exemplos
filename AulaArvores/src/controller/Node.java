package controller;

public class Node {
		public int element; //Elemento do Node � um inteiro
		public Node esq; //Refer�ncia para o filho esquerdo
		public Node dir; //Refer�ncia para o filho direito
		//Construtor do node
		public Node(int valor, Node e, Node d){
			element = valor;
			esq = e;
			dir = d;
		}
}
