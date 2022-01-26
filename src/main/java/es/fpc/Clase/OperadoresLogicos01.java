package es.fpc.Clase;
public class OperadoresLogicos01 {
    public static void main(String[] args) {
        System.out.println("Adivina el número.");
        System.out.print("Introduce un número entre 1 y 100: ");

        String linea = System.console().readLine();
        int n = Integer.parseInt(linea);
        if((n < 1) || (n > 100)){
            System.out.println("El número debe estar en el intervalo 1-100.");
            System.out.print("Introduce el número de nuevo: ");
            linea = System.console().readLine();
            n = Integer.parseInt(linea);
        }
        if(n == 24){
              System.out.println("Has acertado");
        }else{
            System.out.println("No has acertado.");
        }
    }
}
