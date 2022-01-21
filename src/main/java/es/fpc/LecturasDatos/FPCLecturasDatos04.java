package es.fpc.LecturasDatos;
import java.util.Scanner;
public class FPCLecturasDatos04 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Horas trabajadas: ");
        int horas = s1.nextInt();
        System.out.println("El salario semanal es de " + (horas*12));
        s1.close();
    }
}
