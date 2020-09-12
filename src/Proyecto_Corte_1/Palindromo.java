package Proyecto_Corte_1;

public class Palindromo {

	public static void main(String[] args) {
		
		
		 
		 int numeros[]= {1, 6,  0 , 3, 0, 1};
		 int inicio= 0;
		 int capacidad=4;
		 esPalindromo(numeros, inicio, capacidad);
		
		System.out.println("¿la matriz dada es contiene un valor palindromo? " + '\n' 
							+ "la respuesta es " + esPalindromo(numeros, inicio, capacidad));
			
	}

	public static boolean esPalindromo(int[] matriz, int inicio, int capacidad) {
		if (inicio>= capacidad) {
					return true;
		}
		
		else if (matriz[inicio] == matriz [capacidad]) {
						return  esPalindromo(matriz, inicio + 1, capacidad - 1);
		}
		
		return false;
	}
		
}
