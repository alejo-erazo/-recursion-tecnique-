package Clase_22_08_Recursion;

public class Factorial {

	public static void main(String[] args) {
	    int a= 10;
		int  n = factorial (a);
		System.out.println("El factorial de " + a + " es: "+ n);
		 
		}

	public  static  int  factorial ( int  a) {
		if (a==1) {
			return a;
		}

		return a * factorial (a- 1);			
	}
	
		
	
		
	

	

}
