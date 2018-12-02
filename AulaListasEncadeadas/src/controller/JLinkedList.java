package controller;

public class JLinkedList {
	protected Node head; //node cabeça da lista
	protected Node tail; //node cauda da lista
	protected long size; //número de nodes da lista
	// Construtor default que cria uma lista vazia
	public JLinkedList(){
	head = null;
	tail = null;
	size = 0;
	}
		//demais métodos...
	UnderflowException exception = new UnderflowException();
	
	public void insertFirst(Node novoNode) {
		novoNode.setNext(head);
		head = novoNode;
		size++;
		if (size == 1) {
			tail = head;
		}
	}
	
	public void insertLast(Node novoNode) {
		if (isEmpty()) {
			insertFirst(novoNode);
		} else {
			novoNode.setNext(null);
			tail.setNext(novoNode);
			tail = novoNode;
			size++;
		}
	}
	
	public Node removeFirst() throws UnderflowException {
		if (isEmpty()) {
			throw new UnderflowException();
		}
		Node removedItem = head;
		if (head == tail) {
			head = tail = null;
		} else {
			head = head.getNext();
		}
			size--;
		return removedItem;
	}
	
	public Node removeLast() throws UnderflowException {
		if (isEmpty()) {
			throw new UnderflowException();
		}
			Node removedItem = tail;
		if (head == tail) {
			head = tail = null;
		} else {
			Node current = head;
		while (current.getNext() != tail) {
			current = current.getNext();
		}
			tail = current;
			current.setNext(null);
		}
			size--;
		return removedItem;
	}
	
	public void print() {
		if (isEmpty()) {
			System.out.println("Lista vazia!");
		} else {
			System.out.print("A lista é: ");
			Node current = head;
			while (current != null) {
				System.out.print(current.getElement().toString() + " ");
				current = current.getNext();
			}
			System.out.println("\n");
		}
	}
	
	public void get(int index) throws IndexOutOfBoundsException {
		if (isEmpty()) {
			System.out.println("ERRO: Lista vazia!");
		} else if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
			} else {
				int posAtual = 0; //a lista inicia na posição 0
				Node current = head;
				Node previous = null;
				while (posAtual < index) {
					previous = current;
					current = current.getNext();
					posAtual++;
				}
				System.out.println("Elemento na posição " + index + ": "
					+ current.getElement());
			}
	}
	
	public void insertAfter(Node n, int pos) throws IndexOutOfBoundsException {
		if (pos < 0 || pos >= size) {
		throw new IndexOutOfBoundsException();
		}
		if (pos == size - 1) {
		insertLast(n);
		} else {
		int posAtual = 0; //a lista inicia na posição 0
		Node current = head;
		while (posAtual < pos) {
		current = current.getNext();
		posAtual++;
		}
		n.setNext(current.getNext());
		current.setNext(n);
		size++;
		}
		}
	
	public void removeAfter(int pos) throws IndexOutOfBoundsException {
		if (pos < 0 || pos >= size) {
		throw new IndexOutOfBoundsException();
		}
		if (pos == size - 1) {
		System.out.println("ERRO: Posição do último da lista!");
		} else {
		int posAtual = 0; //a lista inicia na posição 0
		Node current = head;
		while (posAtual < pos) {
		current = current.getNext();
		posAtual++;
		}
		current.setNext(current.getNext().getNext());
		size--;
		}
		}
		
	public boolean isEmpty() {
		return head == null;
	}
	public Node getFirst() throws UnderflowException {
		if (isEmpty()) {
		throw new UnderflowException();
		}
		return head;
	}
	public Node getLast() throws UnderflowException {
		if (isEmpty()) {
		throw new UnderflowException();
		}
		return tail;
	}
		
}