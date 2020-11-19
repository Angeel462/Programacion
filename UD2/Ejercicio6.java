import java.util.Scanner;
public class Ejercicio6 {

	public static void main(String[] args) {

    double primero, notaDeseada, notaNecesaria;

    Scanner teclado = new Scanner(System.in);
    System.out.print("Nota primer examen: ");
    primero = teclado.nextDouble();

    System.out.print("Nota deseada: ");
    notaDeseada = teclado.nextDouble();
    
    double notaActual = primero * 0.4;
    double puntosNecesarios = notaDeseada - notaActual;
    notaNecesaria = puntosNecesarios / 0.6;
    
    if(notaNecesaria > 10) {
        System.out.println("No puedes sacar esa nota");
    } else {
        System.out.println("Tienes que sacar un " + notaNecesaria);
    }
    if(notaNecesaria < 0) {
        System.out.println("No puedes sacar esa nota");
    } 
}
}
    
    //comentario
    /*comentario
                largo*/