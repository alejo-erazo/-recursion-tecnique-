package Clase_22_08_Recursion;

public class DividirDosNumeros {

	public static void main(String[] args) {
		

		int d= cociente (10, 2);
		System.out.println("el resultado de la division es: "+ d);
		
	}
		
	public static int cociente (int a, int b) {
		if (a<b) {
			return 0;
		
		}
		
		return 1 + cociente (a-b, b);
	}	
		
	}


