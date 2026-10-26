import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Dispositivo> dispo = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int opcaoMenu = 0;

        do{

            System.out.println("== MENU DE OPÇÕES ==");
            System.out.println("1- Cadastrar Computador");
            System.out.println("2- Cadastrar Impressora");
            System.out.println("3- Cadastrar Roteador");
            System.out.println("4- Listar Dispositivos");
            System.out.println("5- Ligar Dispositivos");
            System.out.println("6- Desligar Dispositivos");
            System.out.println("7- Exibir Detalhes de ");

        }while(opcaoMenu != 8);
        
    }
}
