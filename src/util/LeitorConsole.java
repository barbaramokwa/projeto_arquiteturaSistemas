package util;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LeitorConsole {

    public static int lerInteiro(Scanner sc, String mensagemPrompt) {
        while (true) {
            System.out.print(mensagemPrompt);
            try {
                int valor = sc.nextInt();
                sc.nextLine(); 
                return valor;
            } catch (InputMismatchException e) {
                System.out.println("Erro! Digite apenas números inteiros.");
                sc.nextLine(); 
            }
        }
    }

    public static double lerDouble(Scanner sc, String mensagemPrompt) {
        while (true) {
            System.out.print(mensagemPrompt);
            try {
                double valor = sc.nextDouble();
                sc.nextLine(); 
                return valor;
            } catch (InputMismatchException e) {
                System.out.println("Erro! Digite apenas números.");
                sc.nextLine(); 
            }
        }
    }
}