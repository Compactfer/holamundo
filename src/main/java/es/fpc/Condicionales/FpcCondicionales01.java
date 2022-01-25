package es.fpc.Condicionales;

public class FpcCondicionales01 {
    public static void main(String[] args) {
        System.out.print("Día: ");
        String dia = System.console().readLine();
        switch(dia){
            case "lunes":
                System.out.println("Toca historia.");
                break;
            case "martes":
                System.out.println("Toca matemáticas.");
                break;
            case "miercoles":
                System.out.println("Toca TIC.");
                break;
            case "jueves":
                System.out.println("Toca dibujo técnico.");
                break;
            case "viernes":
                System.out.println("Toca inglés.");
                break;
            default:
                System.out.println("No se detecta el día.");
        }
    }
}
