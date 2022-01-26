package es.fpc.Clase;

public class SentenciaIf02 {
    public static void main(String[] args) {
        System.out.print("Introduce un número entero: ");
        String linea = System.console().readLine();
        int x = Integer.parseInt(linea);

        if(x<0){
            System.out.println("El número es negativo");
        }else{
            System.out.println("El número es positivo");
        }
    }
}
