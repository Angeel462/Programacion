import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {

    double a;
    double b;
    double c;

    Scanner teclado = new Scanner(System.in);
    System.out.print("Primer numero: ");
    a = teclado.nextDouble();
    
    Scanner teclado2 = new Scanner(System.in);
    System.out.print("Segundo numero: ");
    b = teclado.nextDouble();
    
    Scanner teclado3 = new Scanner(System.in);
    System.out.print("Tercer numero: ");
    c = teclado.nextDouble();

    if (a > b && a > c){
        System.out.print(a+ " es mayor que las otras opciones");
    }
    else if (b > a && b > c){
        System.out.print(b+ " es mayor que las otras opciones");
    } 
    else if (c > a && c > b){
        System.out.print(c+ " es mayor que las otras opciones");
    
    } 
  }
}

// Comprobaciones -> 123, 321, 312, 555, 544, 454, 445 