package es.fpc.VariablesJava;

public class FPCVariablesJava03 {
    public static void main(String[] args) {
        int precio_total = 100;
        int IVA = 21; //21% de IVA

        System.out.println("El precio con IVA es de " + (precio_total+(precio_total*IVA/100)));
    }
}
