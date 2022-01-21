package es.fpc.PrimerosPasos;

public class FPCPrimerosPasosJava04 {
    public static void main(String[] args) {
        for(int fila = 1; fila <= 9; fila++)
        {
            for(int espacios = 9; espacios >= fila; espacios--){
                System.out.print(" ");
            }
            for(int col = 1; col <= fila; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
