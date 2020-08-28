package Clase_22_08_Recursion;

public class Potencia {

	public static void main(String[] args) {
		
				int a=2;
				int b=7;
		    	int x = potencia (a,b);
				System.out.println ( + a + " elevado a la " + b + " es: " + x);
			}

			public  static  int  potencia ( int  a , int  b ) {
				if (b==1) {
					return a;
				}

				return a * potencia (a, b- 1);			
			}
		} 

	

	