package controller;

public class BinaryTree {
	public Node raiz; //node raiz da árvore
	public BinaryTree() {
			raiz = null;
	}
	
	// true se vazio, false caso contrario 
	public boolean isEmpty(){
		return raiz == null;
	}
	
	public void inserir(Node p, int valor) {
		if (p == null) {
			raiz = new Node(valor, null, null);
		} else if (valor <= p.element) {
			if (p.esq != null) {
				inserir(p.esq, valor);
			} else {
				p.esq = new Node(valor, null, null);
			  }
				} else if (valor > p.element) {
					if (p.dir != null) {
						inserir(p.dir, valor);
					} else {
						p.dir = new Node(valor, null, null);
					}
				  }
	}
	
	public String printTree(Node p) {
		String retorno;
		retorno = "(";
		if (p != null) {
			retorno += " " + p.element + " ";
			retorno += printTree(p.esq);
			retorno += printTree(p.dir);
		}
		retorno = retorno + ") ";
		return retorno;
		}
	
	public void preOrdem(Node p) {
		if (p != null) {
			System.out.print(p.element + " ");
			preOrdem(p.esq);
			preOrdem(p.dir);
		}
	}
	
	public void inOrdem(Node p) {
		if (p != null) {
			inOrdem(p.esq);
			System.out.print(p.element + " ");
			inOrdem(p.dir);
		}
	}
	
	public void posOrdem(Node p) {
		if (p != null) {
			posOrdem(p.esq);
			posOrdem(p.dir);
			System.out.print(p.element + " ");
		}
	}
	
	boolean acha = false;
	public void buscaValor(Node p, int valor){
		if (p == null) {
			System.out.println("arvore vazia");
		} else {	
			while(acha = false){	
				if (valor == p.element) {
					acha = true;
				}else if (p.esq.element > valor){
					buscaValor(p.esq, valor);
				} else {
					buscaValor(p.dir, valor);
				}	
				if (valor > p.dir.element) {
						buscaValor(p.dir, valor);
					} else {
						buscaValor(p.esq, valor);
					}
		}
		}
		System.out.println(valor);
	}	
}