package es.fpc.LecturasDatos;
import java.util.Scanner;

public class FPCLecturasDatos05 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Nota en el examen: ");
        double nota1 = s1.nextDouble();
        double nota1Bruto = nota1 * 0.4; //40 % de la nota final

        System.out.print("Nota final deseada: ");
        double notaDeseada = s1.nextDouble();

        double notaNecesaria = (notaDeseada-(nota1Bruto))/0.6; //60% de la nota deseada es la nota necesaria

        if(notaNecesaria <= 10){
            System.out.println("Para sacar un " + notaDeseada + " en la nota final, en el próximo examen debes sacar como mínimo un " + notaNecesaria + ".");
        } else{
            System.out.println("No puedes sacar un " + notaDeseada + ". Lo máximo que puedes sacar es un " + (nota1Bruto+6) + ", suponiendo que en el próximo saques un 10.");
        }
        s1.close();
    }
}
