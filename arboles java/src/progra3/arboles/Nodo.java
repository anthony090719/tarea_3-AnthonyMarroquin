package progra3.arboles;

public class Nodo {
	
	int value;
	Nodo izq;
	Nodo der;
	public Nodo(int value, Nodo izq, Nodo der) {
		this.value = value;
		this.izq = izq;
		this.der = der;
	}
	public Nodo(int value) {
		this.value = value;
	}
	

}
