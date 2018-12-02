package controller;

public class DynamicQueue {
	protected Node pri; //primeiro Node da fila
	protected Node ult; //último Node da fila
	
	public DynamicQueue(){
		pri = null;
		ult = null;
	}
	
	/* Retorna:
	- true se a fila está vazia
	- false caso contrário */
	public boolean isEmpty() {
		return pri == null;
	}
	
	/* Retorna o número de elementos na fila */
	public int getSize() {
		int size = 0;
		Node current = pri;
		while (current != null) {
			size++;
			current = current.getNext();
		}
		return size;
	}
	
	/* Retorna o elemento no início da fila */
	public char showFront() throws EmptyQueueException {
		if (isEmpty()) {
			throw new EmptyQueueException();
		}
		return pri.getElement();
	}
	
	public void enqueue(char element) {
		if (ult == null) {
			Node novo = new Node(element);
			pri = novo;
			ult = novo;
		} else {
			Node novo = new Node(element);
			ult.setNext(novo);
			ult = novo;
          }
	}
	
	public char dequeue() throws EmptyQueueException {
		if (isEmpty()) {
			throw new EmptyQueueException();
		}
		if (pri == ult) {
			char temp = pri.getElement();
			pri = null;
			ult = null;
			return temp;
		} else {
			char temp = pri.getElement();
			pri = pri.getNext();
			return temp;
		  }
	}
	
	
}
