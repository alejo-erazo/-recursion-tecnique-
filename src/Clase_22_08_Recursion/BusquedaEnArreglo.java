package Clase_22_08_Recursion;

public class BusquedaEnArreglo {

	public static void main(String[] args) {
	
		int numeros[]= {9, 6, 5, 11, 7, 2, 1, 3, 4};
		int buscado= 15;
		boolean resultadoBusqueda= buscar (numeros, buscado, 0);
		System.out.println("¿el numero "+ buscado + " se encuentra en el arreglo de numeros dado?" + '\n' 
							+ "la respuesta es " + resultadoBusqueda);
	}
			 
			public static boolean buscar (int [] num, int bus, int desde) {
				if(desde == num.length) {
					return false;
			}
				if(num[desde] == bus) {
					return true;
				}
				
				return buscar(num, bus, desde + 1);
			}	
}
