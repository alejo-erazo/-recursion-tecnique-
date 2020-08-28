package Clase_22_08_Recursion;

public class ImprimirNumeros {
	
	 static void imprimir(int a) {
	        if (a>0) {
	            imprimir(a-1);
	            System.out.print(a +", "  );            
	        }    
	    
}

	public static void main(String[] args) {
		
		 imprimir(6);
		
	}
	
	}
