package es.fpc.LecturasDatos;
import java.util.Scanner;

public class FPCLecturasDatos05 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Nota en el examen: ");
        double nota1 = s1.nextDouble();
        double nota1_bruto = nota1 * 0.4;

        System.out.print("Nota final deseada: ");
        double nota_deseada = s1.nextDouble();

        double nota_necesaria = (nota_deseada-(nota1_bruto))/0.6;

        if(nota_necesaria <= 10){
            System.out.println("Para sacar un " + nota_deseada + " en la nota final, en el próximo examen debes sacar como mínimo un " + nota_necesaria + ".");
        } else{
            System.out.println("No puedes sacar un " + nota_deseada + ". Lo máximo que puedes sacar es un " + (nota1_bruto+6) + ", suponiendo que en el próximo saques un 10.");
        }
        s1.close();
    }
}
