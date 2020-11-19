import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		int a= 2;
		int b= 7;
        int aux;
        
		aux=a;
		a=b;
		b=aux;
				
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime un numero");
		
		b= teclado.nextInt();
		a= teclado.nextInt();
		
		System.out.println("A es: "+a+""+ ", B es: "+b);
	}

}
