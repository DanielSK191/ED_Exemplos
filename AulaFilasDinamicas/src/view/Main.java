package view;

import controller.DynamicQueue;
import controller.EmptyQueueException;

public class Main {
	public static void main(String args[]) {
		DynamicQueue fila = new DynamicQueue();
		try {
			fila.enqueue('a'); System.out.println(fila.showFront());
			fila.enqueue('b');
			fila.dequeue(); System.out.println(fila.showFront());
			fila.enqueue('c');
			fila.dequeue(); fila.dequeue();
			fila.enqueue('d'); 
			fila.enqueue('e');
			fila.enqueue('f');
			System.out.println(fila.getSize());
			System.out.println(fila.showFront());
			fila.dequeue();
			while (!fila.isEmpty()) {
				System.out.print(fila.dequeue() + "\n");
			}
		} catch (EmptyQueueException e) {
				System.out.println("ERRO: Impossível remover!");
				e.printStackTrace();
			}
		
	}
}
