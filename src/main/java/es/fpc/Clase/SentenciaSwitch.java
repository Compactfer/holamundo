package es.fpc.Clase;

public class SentenciaSwitch {
    public static void main(String[] args) {
        System.out.print("Introduzca un número de estación: ");
        int estacion = Integer.parseInt(System.console().readLine());
        String nombreDeLaEstacion;
        switch(estacion){
            case 1:
                nombreDeLaEstacion = "primavera";
                break;
            case 2:
                nombreDeLaEstacion = "verano";
                break;
            case 3:
                nombreDeLaEstacion = "otoño";
                break;
            case 4:
                nombreDeLaEstacion = "invierno";
                break;
            default:
                nombreDeLaEstacion = "No existe";
        }
        System.out.println("Nombre de la estación: " + nombreDeLaEstacion);
    }
}