package es.fpc.LecturasDatos;
import java.util.Scanner;
public class FPCLecturasDatos03 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("1º número: ");
        int x = s1.nextInt();
        System.out.print("2º número: ");
        int y = s1.nextInt();

        System.out.println("Suma: " + (x+y));
        System.out.println("Resta: " + (x-y));
        System.out.println("Multiplicación: " + (x*y));
        System.out.println("División: " + (x/y));
        s1.close();
    }
}
