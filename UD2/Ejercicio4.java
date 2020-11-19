
public class Ejercicio4recentment {

	public static void main(String[] args) {
		
		System.out.println("Numero de alumnos");
		
		System.out.println("Introduce un numero");
   		int alumnos = lector.nextInt();

		System.out.println("Numero de alumnas");
		
		System.out.println("Introduce un numero");
   		int alumnas = lector.nextInt();
		
		Double total=alumnos+alumnas;
		
		int res1= (100*alumnos)/total;
		int res2= (100*alumnas)/total;
		
		System.out.println("El porcentage de alumnos en el curso es   "+res1);
		
		System.out.println("El porcentage de alumnas en el curso es   "+res2);
		
		

	}

}
