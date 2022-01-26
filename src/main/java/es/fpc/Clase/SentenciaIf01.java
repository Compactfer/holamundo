package es.fpc.Clase;

public class SentenciaIf01 {
    public static void main(String[] args) {
        System.out.print("¿Capital de Kiribati?");
        String respuesta = System.console().readLine();

        if(respuesta.equals("Tarawa")){
            System.out.println("Respuesta correcta.");
        }else{
            System.out.println("Respuesta incorrecta.");
        }

    }
}
