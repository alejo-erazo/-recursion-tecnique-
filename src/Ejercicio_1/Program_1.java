package Ejercicio_1;

public class Program_1 {

	public static void main(String[] args) {
		
		Mejorada m1 = new Mejorada("Juan", 40000);
		Procesos p1 = new Procesos();
		
		p1.agregarEstudiantes(m1);
		
		
		Mejorada m2 = new Mejorada("luis", 80000);
		p1.agregarEstudiantes(m2);
		
		float prom = p1.calcularPromedio();
		System.out.println ("El promedio de los pagos realizados por los estudiantes es : " + prom);
		
		float mayorValor = p1.calcularMayor();
		System.out.println ("El mayor valor pagado por un estudiante es: " + mayorValor);
		
		float diferencia = p1.calcularDiferencia();
		System.out.println ("La diferencia entre el mayor valor pagado y el promedio de pagos es: " + diferencia);
		
	
	}

}

