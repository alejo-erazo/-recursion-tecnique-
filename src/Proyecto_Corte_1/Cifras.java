package Proyecto_Corte_1;

public class Cifras {

	public static void main(String[] args) {
		 int numero=186754;
		  int contador=0;
		 
		
		System.out.println("el numero " + numero + " tiene " + cifras(numero, contador) + " cifras");
	
	}
	
	public static int cifras (int numero, int contador) {
		if(numero==0) {
			return contador;
		}
		
		else 
			if(numero!=0) {
			numero= numero/10;
			
		
			return cifras(numero, contador+1);
		

}
		return 0;	

}
}