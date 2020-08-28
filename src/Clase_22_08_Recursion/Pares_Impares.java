package Clase_22_08_Recursion;

public class Pares_Impares {

					 static int par;
					static int imp;
	           
				public static  int contarParesImpares (int [] num, int pos) {
					
					
						 if(pos<num.length) {
							 if (num[pos]%2==0) {
								 par=par+1;
								
							 }
							 else { 
								 imp=imp+1;
								
							 }
							 contarParesImpares (num, pos + 1);
						 }
						
					 return 1;
						
					 	}
				
					 public static int contarParesImpares (int [] num) {
						 
						 return (contarParesImpares(num,0));
						
						 
					 }
				
	
      public static void main(String[] args) {
	
    	  int numeros[]= {9, 6, 5, 11, 14, 2, 1, 3, 4};
	
    	  		contarParesImpares(numeros);
    	  		 System.out.println("la cantidad de numeros pares en el arreglo es de: " + par);
			 	 System.out.println("la cantidad de numeros pares en el arreglo es de: " + imp);
	
}			
}
