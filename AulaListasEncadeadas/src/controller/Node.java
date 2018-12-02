package controller;


public class Node {
	private String element; //Elemento do Node � uma string
	private Node next; //Refer�ncia para um objeto Node
	//Cria um node com um elemento e uma refer�ncia para o pr�ximo node
	public Node(String s, Node n){
		element = s;
		next = n;
	}
	//Cria um node com um elemento e uma refer�ncia null
	public Node(String element) {
		this(element, null);
	}
	//Retorna o elemento deste node
	public String getElement(){ return element; }
	//Retorna a refer�ncia para o pr�ximo node
	public Node getNext(){ return next; }
	//Define o elemento deste node
	public void setElement(String newElem){ element = newElem; }
	//Define a refer�ncia para o pr�ximo node
	public void setNext(Node newNext){ next = newNext; }
	
	public static void main(String args[]) {
		JLinkedList lista = new JLinkedList();
		try {
		lista.insertFirst(new Node("D"));
		lista.insertFirst(new Node("A"));
		lista.insertFirst(new Node("B"));
		lista.insertLast(new Node("S"));
		lista.insertLast(new Node("C"));
		lista.removeFirst(); //pode lan�ar UnderflowException
		lista.removeLast(); //pode lan�ar UnderflowException
		} catch (UnderflowException e) {
		System.out.println("ERRO: Imposs�vel remover!");
		e.printStackTrace();
		}
		lista.print();
		}
}