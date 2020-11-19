import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
    double x, z;
    Scanner teclado = new Scanner(System.in);
    System.out.print("x es: ");
    x = teclado.nextDouble();
    System.out.print("y es: ");
    y = teclado.nextDouble();
    double z1 = "1" + (x*x/y);
    double z2 = x*x*x / "1"+y;
    System.out.print(z1/z2);

    }
}