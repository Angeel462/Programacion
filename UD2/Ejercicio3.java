import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		int x;
		int y;
		
		x=144;
		y=999;
		
		System.out.println("La suma es: "+ x+y); 
		
		System.out.println(x-y);
		
		System.out.println("La division es: "+ x/y);
		
		System.out.println("La multiplicacion es: "+ x*y);
		
        Scanner teclado= new Scanner(System.in);
        
    // El apartado b) se solucionaria con la siguiente parte poniendola encima de 
    // la parte de las operaciones
        
    
        System.out.println("Dime el valor de x");
		
		x= teclado.nextInt();
		System.out.println("El valor de x es: " +x);
		
		
		System.out.println("Dime el valor de y");
		
		y= teclado.nextInt();
		System.out.println("El valor de y es: " +y);
				

	}

}
