package Proyecto_Corte_1;

public class Busqueda_Element_Mayor {

	public static void main(String[] args) {
		
		 int  numeros[] = {8, 13, 6, 50, 9, 16, 3};
		 int tmp= 0;
		 int cont= 0;
		 
		 System.out.println("el numero mayor en el arreglo dado es " + numeroMayor(numeros, tmp, cont));
	}
		public static int numeroMayor (int[] matriz, int tmp, int cont) {
			if (cont== matriz.length) {
				return tmp;
			}
			else if(matriz[cont]>tmp) {
				  tmp= matriz[cont];
				
				
			}
				return numeroMayor(matriz, tmp, cont + 1);
		}

	
		}
		
