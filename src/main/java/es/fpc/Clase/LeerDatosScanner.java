package es.fpc.Clase;
import java.util.Scanner;
public class LeerDatosScanner {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.print("Escribe tu nombre y edad (separados por un espacio): ");
        String nombre = s1.next();
        int edad = s1.nextInt();
        System.out.println(nombre + ", tienes " + edad + " años.");

        System.out.print("Valor booleano: ");
        boolean b1 = s1.nextBoolean();

        System.out.print("Valor flotante: ");
        float f1 = s1.nextFloat();

        System.out.print("Valor double: ");
        double d1 = s1.nextDouble();

        System.out.println("Boolean: " + b1 +"\nFlotante: " + f1 + "\nDouble: " + d1);
        s1.close();
    }
}
