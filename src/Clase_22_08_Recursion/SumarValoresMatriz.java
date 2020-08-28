package Clase_22_08_Recursion;

      public class SumarValoresMatriz {
	
	           static int total;
	
	           public static int sumarElementosMatriz (int [] elements,int pos) {
		
	        	   	if(pos<elements.length) {
	        	   		total= total + elements[pos];
	        	   		
	        	   		sumarElementosMatriz(elements, pos+1);
	        	   	}
	        	   	
	           
	        	   		return total;
	           		}
	           
	public static int sumarElementosMatriz (int [] num) {
		 
		 return (sumarElementosMatriz(num,0));
	}
	public static void main(String[] args) {
		
		 int numeros[]= {9, 49, 5, 11};
			
		 sumarElementosMatriz(numeros);
	  		 System.out.println("la cantidad de numeros pares en el arreglo es de: " + total);
		

	}  

}
