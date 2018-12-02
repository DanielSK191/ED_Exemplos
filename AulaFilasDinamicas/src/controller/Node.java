package controller;

public class Node {
	private char element; //Elemento do Node é um char
	private Node next; //Referência para um objeto Node
	
	//Cria um node com um elemento e uma referência para o próximo node
	public Node(char c, Node n){
		element = c;
		next = n;
	}
	//Cria um node com um elemento e uma referência null
	public Node(char element) {
		this(element, null);
	}
	//Retorna o elemento deste node
	public char getElement(){ 
		return element; 
	}
	//Retorna a referência para o próximo node
	public Node getNext(){ 
		return next; 
	}
	//Define o elemento deste node
	public void setElement(char newElem){ 
		element = newElem; 
	}
	//Define a referência para o próximo node
	public void setNext(Node newNext){ 
		next = newNext; 
	}
}
