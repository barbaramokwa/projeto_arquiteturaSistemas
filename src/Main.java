import exceptions.NumeroNegativo;
import service.GerenciadorDispositivos;
import util.LeitorConsole;
import controller.CadastroController;
import view.MenuConsoleView;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        GerenciadorDispositivos gerenciador = new GerenciadorDispositivos();

        Scanner sc = new Scanner(System.in);

        int opcaoMenu = -1;

        do {
            MenuConsoleView.exibirMenu();
            opcaoMenu = LeitorConsole.lerInteiro(sc, "\tESCOLHA: ");

            try {
                switch (opcaoMenu) {
                    case 1:
                        CadastroController.cadastrarComputador(gerenciador, sc);
                        break;
                    case 2:
                        CadastroController.cadastrarImpressora(gerenciador, sc);
                        break;
                    case 3:
                        CadastroController.cadastrarRoteador(gerenciador, sc);
                        break;
                    case 4:
                        CadastroController.listarDispositivos(gerenciador);
                        break;
                    case 5:
                        CadastroController.ligarDispositivo(gerenciador, sc);
                        break;
                    case 6:
                        CadastroController.desligarDispositivo(gerenciador, sc);
                        break;
                    case 7:
                        CadastroController.buscarDispositivo(gerenciador, sc);
                        break;
                    case 0:
                        System.out.println("\tSaindo do sistema...");
                        break;
                    default:
                        System.out.println("\tOpção inválida. Tente novamente.");
                }
            } catch (NumeroNegativo e) {
                System.out.println("Erro de validação: " + e.getMessage());
            }

        } while (opcaoMenu != 0);

        sc.close();
    }
}