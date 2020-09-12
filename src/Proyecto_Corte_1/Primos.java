package Proyecto_Corte_1;

public class Primos {
	
	public static void main(String[] args) {
		
		System.out.println("el numero  " + n + " es primo ? " + primos(n, n-1));
	}
	
	static int n=7;
	static int tmp= n-1;
	
 public static boolean primos (int n, int tmp) {
	 
	 if(tmp==1) {
		 
		 return true;
	 }
	 else 

		 if(n%tmp==0) {
			 return false;
		 }
		 else 
			 return primos(n, tmp-1);
	}
	

	

}
