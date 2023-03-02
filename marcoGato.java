import java.util.Scanner;

public class marcoJuego {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cadena = "";
       
        while (cadena.length() != 9) {

            System.out.print("Introduce la cadena no mayor a 9 caracteres: ");
            cadena = scanner.nextLine();

            if (cadena.length() != 9){ // Limite de 9 caracteres en el tablero
                System.out.println("\nLa cadena no debe ser mayor a 9 caracteres.\n");
            }
        }

        int inicio = 0;  // Posicionar cadena a lo largo del tablero
        int fin = 3;
        System.out.println("-----");  // La parte superior del tablero
        while (fin <= cadena.length()) {
            String subcadena = cadena.substring(inicio, fin);
            System.out.println("|" + subcadena + "|");
            inicio = fin;
            fin += 3;
        }
        System.out.println("-----");  // La parte inferior del tablero
    }
}