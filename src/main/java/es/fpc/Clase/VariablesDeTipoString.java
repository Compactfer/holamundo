package es.fpc.Clase;

public class VariablesDeTipoString {
    public static void main(String[] args) {
        String palabra = "Holaa";
        System.out.println(palabra);

        //Secuencias de escape:
            System.out.println("Esto es un\ttabulador");
            System.out.println("Esto es un \nsalto de línea");
            System.out.println("Holaa esta secuencia hace un retroceso\b ");
            System.out.println("Esto mueve el cursor \ral incio");//sobreescribe el texto desde el inicio del comando
            System.out.println("Esto son \'comillas simples\'");
            System.out.println("Esto son \"comillas dobles\"");
            System.out.println("Barra invertida: \\");
            System.out.println("Caracter Ascii: \1");
    }
}
