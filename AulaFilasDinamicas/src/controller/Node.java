package controller;

public class Node {
	private char element; //Elemento do Node � um char
	private Node next; //Refer�ncia para um objeto Node
	
	//Cria um node com um elemento e uma refer�ncia para o pr�ximo node
	public Node(char c, Node n){
		element = c;
		next = n;
	}
	//Cria um node com um elemento e uma refer�ncia null
	public Node(char element) {
		this(element, null);
	}
	//Retorna o elemento deste node
	public char getElement(){ 
		return element; 
	}
	//Retorna a refer�ncia para o pr�ximo node
	public Node getNext(){ 
		return next; 
	}
	//Define o elemento deste node
	public void setElement(char newElem){ 
		element = newElem; 
	}
	//Define a refer�ncia para o pr�ximo node
	public void setNext(Node newNext){ 
		next = newNext; 
	}
}
