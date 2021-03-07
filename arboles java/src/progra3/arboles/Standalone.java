package progra3.arboles;

public class Standalone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArbolBinario bt = new ArbolBinario();
		
		bt.agregar(6);
	    bt.agregar(4);
	    bt.agregar(8);
	    bt.agregar(3);
	    bt.agregar(5);
	    bt.agregar(7);
	    bt.agregar(9);
	    
		 

	    // se utiliza para eliminar un dato de un arbol
	   // System.out.println("eliminacion " + bt.contiene(6));
	    //bt.eliminar(9);
	    //System.out.println(bt.contiene(10));
	    
	    // se utiliza al querer encontrar un elemento en el arbol
	    System.out.println("busqueda " + bt.contiene(6));
	    bt.contiene(6);
	  
	   //se utiliza para busqueda de profundidad en orden
	   //System.out.print(" " + nodo.value);
	   //bt.AtravesarEnOrden( );
	    
	  //se utiliza para busqueda de profundidad en pre orden
	  //System.out.print(" " + nodo.value);
	  //bt.AtravesarPreOrden( );
	    
	  //se utiliza para busqueda de profundidad en post orden
	  //System.out.print(" " + nodo.value);
	  //bt.AtravesarPostOrden(null);
	     
	   //se utiliza para busqueda de amplitud 
	   //System.out.print(" " + node.value)
	  
	    
	    System.out.println("Finish");

	}

}
			
		
