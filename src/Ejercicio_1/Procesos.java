package Ejercicio_1;

public class Procesos {

	int capacidad= 1000;
	int cantidad=0;
	
	Mejorada []  estudiantes= new Mejorada[capacidad];
	
	// metodo para agregar estudiantes
	
	public void agregarEstudiantes(Mejorada est) {
		
		if (cantidad>capacidad-1){
			System.out.println("error, sobrepasa la capacidad");
		}
		else {
			estudiantes[cantidad]= est;
			cantidad++;
		}
	}
	
// metodo para calcular el promedio
	
	float prom= 0;
	float totalProm=0;
	public float calcularPromedio() {
		
		for (int i=0; i< cantidad; i++) {
			prom= prom + estudiantes[i].valor;
		}
		 totalProm= prom /cantidad;
	return totalProm;	 
	}
	
// metodo para calcular el valor mayor
	float mayor=0;
	public float calcularMayor() {
		
			for (int i=0; i< cantidad; i++) {
			if (mayor< estudiantes[i].valor) {
				mayor= estudiantes[i].valor;
				
			}
			
		}
		return mayor;	 
	}
	
	
	// metodo para calcular la diferencia entre el mayor y el promedio
	
	
	public float calcularDiferencia() {
		 float diferencia = mayor - totalProm; 
		 
		 return diferencia;
	}
	
	
	
	

	
}

