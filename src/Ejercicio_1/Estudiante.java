
/*package Ejercicio_1;
import java.util.Scanner;

public class Estudiante {
String nombreEstudiante;
float valorPagado;

public Estudiante(String _nombreEstudiante, float _valorPagado) {
	nombreEstudiante= _nombreEstudiante;
	valorPagado= _valorPagado;
	
}

//metodo pata llenar arreglo de estudiantes


public Estudiante[] ingresarEstudiantes(Estudiante E1[], int capacidad) {

 Scanner sc= new Scanner(System.in);

	for (int i=0; i< capacidad; i++) {
		System.out.println("ingrese nombre del estudiante "+ (i+1)+ ":"+" ");
		String nombre= sc.nextLine();
		System.out.println("ingrese el valor pagado por el estudiante "+ (i+1)+ ":"+" ");
		float valor= sc.nextFloat();
		sc.nextLine();
		Estudiante est= new Estudiante(nombre, valor);
		E1 [i]= est ;		
		
	}
	return E1;


}

public void calculos(Estudiante E1[], int capacidad) {
	float promedio= promedio  (E1, capacidad);
	Estudiante may= E1[0];
	for (int i= 0; i<capacidad;i++) {
		System.out.println("el estudiante "+E1[i].nombreEstudiante + " paga: "+ E1[i].valorPagado);
		if (E1[i].valorPagado>may.valorPagado) {
			may=E1[i] ;
		}
		
	}
	float diferencia= may.valorPagado -promedio;
	System.out.println("el promedio de pagos es: "+promedio);
	System.out.println("el estudiante que mas paga  es: "+ may.nombreEstudiante + " "+may.valorPagado);
	System.out.println("la diferencia entre el valor mas alto pagado por un estudiante y el promedio del total"
			+ " los pagos es: "+diferencia);
}

public float promedio (Estudiante E1[], int capacidad) {
	float suma=0;

	for (int i= 0; i<capacidad;i++) {
		suma= suma+ E1[i].valorPagado;
			}	
	float respuesta= suma / capacidad;
	return respuesta ;
}
	


}

*/