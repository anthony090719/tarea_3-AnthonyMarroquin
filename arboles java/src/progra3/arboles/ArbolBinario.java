package progra3.arboles;

import java.util.LinkedList;
import java.util.Queue;

public class ArbolBinario {
	Nodo raiz;
	
	private Nodo agregarRecursivo(Nodo nodoActual, int value) {
		if(null ==nodoActual) {
			return new Nodo(value);
		}
		
		if (value < nodoActual.value) {
			nodoActual.izq = agregarRecursivo(nodoActual.izq, value);
		}else if (value > nodoActual.value) {
			nodoActual.der = agregarRecursivo(nodoActual.der, value);
		}else {
			return nodoActual;
		}
		
		return nodoActual;
    
}
	public void agregar(int value) {
		raiz = agregarRecursivo(raiz, value);
		
	}
	
	private boolean contieneRecursivo(Nodo nodoActual, int value) {
		if (null == nodoActual) {
			return false;
		}
		System.out.println("visitando =" + nodoActual.value);
		if(nodoActual.value == value) {
			return true;
		}
		
		if (value < nodoActual.value) {
			System.out.println("visitar izq ");
			return contieneRecursivo(nodoActual.izq, value);
		}else {
			System.out.println("visitar der ");
			return contieneRecursivo(nodoActual.der, value);
		}
		
		
		//return value < nodoActual.value  ? contieneRecursivo(nodoActual.izq, value):
		//	contieneRecursivo(nodoActual.der, value);
	}
	
	public boolean contiene(int value) {
		return contieneRecursivo(raiz, value);
	}
	
	public void eliminar(int value) {
		raiz = eliminarRecursivo(raiz, value);
	}
	
	private Nodo eliminarRecursivo(Nodo nodoActual, int value) {
		if(null==nodoActual) {
			return null;
		}
		
		if(value == nodoActual.value) {
			//caso 1:un nodo no tiene niños
			if (nodoActual.izq == null && nodoActual.der == null) {
				return null;
			}
			//caso 2: un nodo tiene exactamente un elemento secundario
			if(nodoActual.der == null) {
				return nodoActual.der;
			}
			// caso 3: un nodo tiene dos secundarios
			int smallestValue = findSmallestValue(nodoActual.der);
			 nodoActual.value = smallestValue;
	            nodoActual.der = eliminarRecursivo(nodoActual.der, smallestValue);
	            return nodoActual;	
		}
		if (value < nodoActual.value) {
            nodoActual.izq = eliminarRecursivo(nodoActual.izq, value);
            return nodoActual;
	}
		 nodoActual.der = eliminarRecursivo(nodoActual.der, value);
	        return nodoActual;
	}
	private int findSmallestValue(Nodo raiz) {
        return raiz.izq == null ? raiz.value : findSmallestValue(raiz.izq);
       
        
	}
	//recorridos en profundidad
	
	// EN ORDEN 
	
	public void AtravesarEnOrden(Nodo nodo) {
	    if (nodo != null) {
	    	AtravesarEnOrden(nodo.izq);
	    	visitar(nodo.value);
	        AtravesarEnOrden(nodo.der);
	       
	}
	
 }
	private void visitar(int value) {
		System.out.print(" " + value);
		
	}


	// PRE ORDEN
	
	 public void AtravesarPreOrden(Nodo nodo) {
	        if (nodo != null) {
	            visitar(nodo.value);
	            AtravesarPreOrden(nodo.izq);
	            AtravesarPreOrden(nodo.der);
	
       }
	        
	}
	 public void AtravesarPostOrden(Nodo nodo) {
	        if (nodo != null) {
	            AtravesarPostOrden(nodo.izq);
	            AtravesarPostOrden(nodo.der);
	            visitar(nodo.value);
	            System.out.print(" " + nodo.value);
}
	 }
	 
	 // BUSQUEDA POR AMPLITUD
	 
	 public void traverseLevelOrder() {
	        if (raiz == null) {
	            return;
	        }

	        Queue<Nodo> nodos = new LinkedList<>();
	        nodos.add(raiz);

	        while (!nodos.isEmpty()) {

	            Nodo nodo = nodos.remove();

	            System.out.print(" " + nodo.value);

	            if (nodo.izq != null) {
	                nodos.add(nodo.der);
	            }

	            if (nodo.der != null) {
	                nodos.add(nodo.der);
}
	        }
	 }
}
	 
	 
