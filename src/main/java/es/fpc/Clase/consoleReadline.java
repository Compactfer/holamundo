package es.fpc.Clase;

public class consoleReadline {
    public static void main(String[] args) {
        String s = System.console().readLine(); //en minúsculas.
        System.out.println(s);

        String num = System.console().readLine();
        int numero = Integer.parseInt(num);
        System.out.println(numero);

    }
}
