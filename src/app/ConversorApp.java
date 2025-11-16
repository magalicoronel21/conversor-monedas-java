package app;

import java.util.Scanner;
import service.ConversorService;

public class ConversorApp {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ConversorService conversor = new ConversorService();

        while (true) {
            System.out.println("\n==== CONVERSOR DE MONEDAS ====");
            System.out.println("1) USD → ARS");
            System.out.println("2) USD → BRL");
            System.out.println("3) USD → CLP");
            System.out.println("4) Salir");
            System.out.print("Elige una opción: ");

            int opcion = scanner.nextInt();

            if (opcion == 4) {
                System.out.println("Saliendo...");
                break;
            }

            System.out.print("Ingrese el monto en USD: ");
            double monto = scanner.nextDouble();

            double resultado = conversor.convertir(opcion, monto);

            System.out.println("Resultado: " + resultado);
        }
    }
}
