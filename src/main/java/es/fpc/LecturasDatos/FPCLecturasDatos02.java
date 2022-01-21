package es.fpc.LecturasDatos;
import java.util.Scanner;
public class FPCLecturasDatos02 {
    public static void main(String[] args) {
       Scanner s1 = new Scanner(System.in);
       System.out.print("Cantidad de euros: ");
       int euros = s1.nextInt();
       System.out.println("Hay " + euros + " euros.");
       s1.close();
    }
}
