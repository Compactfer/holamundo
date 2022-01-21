package es.fpc.LecturasDatos;
import java.util.Scanner;
public class FPCLecturasDatos01 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("1º número: ");
        int x = s1.nextInt();
        System.out.print("2º número: ");
        int y = s1.nextInt();

        System.out.println("El resultado de la multiplicación es " + x*y);
        s1.close();
    }
}
