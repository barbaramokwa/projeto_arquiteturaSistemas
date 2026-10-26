import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Dispositivo> dispo = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int opcaoMenu = 0;
        int id = 0;

        do{

            System.out.println("== MENU DE OPÇÕES ==");
            System.out.println("1- Cadastrar Computador");
            System.out.println("2- Cadastrar Impressora");
            System.out.println("3- Cadastrar Roteador");
            System.out.println("4- Listar Dispositivos");
            System.out.println("5- Ligar Dispositivos");
            System.out.println("6- Desligar Dispositivos");
            System.out.println("7- Exibir Detalhes de um Dispositivo");
            System.out.println("8- Sair");

            opcaoMenu = sc.nextInt();
            sc.nextLine();

            switch(opcaoMenu){
                case 1:
                    System.out.println("== CADASTRANDO COMPUTADOR ==");

                    System.out.println("Nome do Computador: ");
                    String nome = sc.nextLine();

                    System.out.println("Quantidade de Memória RAM: ");
                    String quant = sc.nextLine();

                    System.out.println("Sistema Operacional: ");
                    String os = sc.nextLine();

                    id++;

                    Computador com = new Computador(id, nome, quant, false, quant, os);
                    dispo.add(com);

                    System.out.println("Computador cadastrado com sucesso!");

                    break;
                case 2:
                    System.out.println("== CADASTRANDO IMPRESSORA ==");

                    System.out.println("Nome da Impressora: ");
                    String nome2 = sc.nextLine();

                    System.out.println("Tipo de Impressão: (Laser ou Jato)");
                    String tipo = sc.nextLine();

                    System.out.println("Velocidade de Impressão: ");
                    double velocidade = sc.nextDouble();

                    id++;

                    

                    System.out.println("Impressora cadastrada com sucesso!");
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    System.out.println("Saindooo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente!");
            }

        }while(opcaoMenu != 8);
        
    }
}
