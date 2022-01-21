package es.fpc.LecturasDatos;
import java.util.Scanner;
public class FPCLecturasDatos02 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        double euros = s1.nextDouble();   
        System.out.println(euros + " euros son " + (euros*166) + " pesetas.");
        s1.close();
    }
}
