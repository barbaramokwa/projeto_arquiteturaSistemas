import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Dispositivo> dispo = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int opcaoMenu = 0;
        int id = 0; //assim, os códigos não ficam repetidos

        do {
            //menu de opções
            System.out.println("\n== MENU DE OPÇÕES ==");
            System.out.println("1- Cadastrar Computador");
            System.out.println("2- Cadastrar Impressora");
            System.out.println("3- Cadastrar Roteador");
            System.out.println("4- Listar Dispositivos");
            System.out.println("5- Ligar Dispositivos");
            System.out.println("6- Desligar Dispositivos");
            System.out.println("7- Exibir Detalhes de um Dispositivo");
            System.out.println("8- Relatório Geral");
            System.out.println("9- Sair");
            System.out.print("\nESCOLHA:");

            opcaoMenu = sc.nextInt();
            sc.nextLine();

            switch (opcaoMenu) {
                case 1:
                    System.out.println("\n== CADASTRANDO COMPUTADOR ==");

                    System.out.println("Nome do Computador: ");
                    String nome = sc.nextLine();

                    if(nome.isBlank()){
                        //verifica se o nome está nulo
                        System.out.println("Insira um nome válido");
                    }else{
                        System.out.println("Fabricante: ");
                        String fab = sc.nextLine();

                        System.out.println("Quantidade de Memória RAM em GB: ");
                        int quant = sc.nextInt();

                        sc.nextLine();

                        System.out.println("Sistema Operacional: ");
                        String os = sc.nextLine();

                        id++;

                        Computador com = new Computador(id, nome, fab, false, quant, os);
                        //objeto computador
                        dispo.add(com); //manda o objeto para o ArrayList

                        System.out.println("Computador cadastrado com sucesso!");

                    }

                    break;
                case 2:
                    System.out.println("\n== CADASTRANDO IMPRESSORA ==");

                    System.out.println("Nome da Impressora: ");
                    String nome2 = sc.nextLine();

                    if(nome2.isBlank()){
                        //verifica se o nome está nulo
                        System.out.println("Insira um nome válido");
                    }else{
                        System.out.println("Fabricante: ");
                        String fabr = sc.nextLine();

                        System.out.println("Tipo de Impressão: (Laser ou Jato)");
                        String tipo = sc.nextLine();

                        System.out.println("Velocidade de Impressão: ");
                        double velocidade = sc.nextDouble();

                        sc.nextLine();

                        id++;

                        Impressora im = new Impressora(id, nome2, fabr, false, tipo, velocidade); //criação de objeto impressora
                        dispo.add(im); //insere no ArrayList o objeto

                        System.out.println("Impressora cadastrada com sucesso!");
                    }
                    break;
                case 3:
                    System.out.println("\n== CADASTRANDO ROTEADOR ==");

                    System.out.println("Nome do Roteador: ");
                    String nome3 = sc.nextLine();

                    if(nome3.isBlank()){
                        //verifica se o nome está nulo
                        System.out.println("Insira um nome válido");
                    }else{
                        //só vai acontecer se o nome não for nulo
                        System.out.println("Fabricante: ");
                        String fab3 = sc.nextLine();

                        System.out.println("Quantidade portas: ");
                        int quant3 = sc.nextInt();

                        sc.nextLine();

                        System.out.println("Velocidade de Rede: ");
                        double vel = sc.nextDouble();

                        sc.nextLine();

                        id++;

                        Roteador ro = new Roteador(id, nome3, fab3, false, quant3, vel);
                        dispo.add(ro);

                        System.out.println("Rotedaor cadastrado com sucesso!");
                    }
                    break;
                case 4:
                    //chamando a função
                    listarCadastrados(dispo);
                    break;
                case 5:
                    System.out.println("\n== LIGANDO OS DISPOSITIVOS ==");
                    //mostra os cadastrados para facilitar na hora 
                    listarCadastrados(dispo);

                    System.out.println("Informe o CÓDIGO do dispositivo que deseja ligar: ");
                    int codBuscado = sc.nextInt();
                    boolean achado = false;

                    for (Dispositivo dispositivo : dispo) {
                        if (codBuscado == dispositivo.getCodigo()) {
                            achado = true;
                            dispositivo.ligar();
                            System.out.println("Dispositivo Ligado com sucesso!");
                            dispositivo.exibirStatus();
                            //mostra status -> oq ligou + estado
                            break;
                        }
                    }

                    if (!achado) {
                        System.out.println("Dispositivo não encontrado");
                    }

                    break;
                case 6:
                    System.out.println("\n== DESLIGANDO OS DISPOSITIVOS ==");
                    listarCadastrados(dispo);

                    System.out.println("Informe o CÓDIGO do dispositivo que deseja desligar: ");
                    int codBuscado2 = sc.nextInt();
                    boolean achado2 = false;

                    for (Dispositivo dispositivo : dispo) {
                        if (codBuscado2 == dispositivo.getCodigo()) {
                            achado2 = true;
                            dispositivo.desligar();
                            System.out.println("Dispositivo desligado com sucesso!");
                            dispositivo.exibirStatus();
                            //mostra o status -> oq desligou + estado
                            break;
                        }
                    }

                    if (!achado2) {
                        System.out.println("Dispositivo não encontrado");
                    }
                    break;
                case 7:
                    System.out.println("\n== EXIBINDO DETALHES DE 1 DISPOSITIVO ==");

                    System.out.println("Informe o códido do dispositivo que deseja exibir: ");
                    int codE = sc.nextInt();
                    sc.nextLine();

                    boolean achadoE = false;

                    for (Dispositivo dispositivo : dispo) {
                        //mostra os detalhes daquele buscado
                        if (codE == dispositivo.getCodigo()) {
                            achadoE = true;
                            dispositivo.exibirDetalhes();
                            dispositivo.exibirStatus();
                        }
                    }
                    //verifica o achado
                    if (!achadoE) {
                        System.out.println("Não encontrado!");
                    }
                    System.out.println("");
                    break;
                case 8:
                    System.out.println("\n== GERANDO RELATÓRIO ==");
                    //função 
                    gerarRelatorio(dispo);
                    break;
                case 9:
                    System.out.println("Saindooo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente!");
            }

        } while (opcaoMenu != 9);
        sc.close();
    }

    public static void gerarRelatorio(ArrayList<Dispositivo> di) {

        int computador = 0;
        int impressora = 0;
        int roteador = 0;

        //verifica em qual classe filha esta e conta a quantidade de cadastros
        for (Dispositivo dispositivo : di) {
            if (dispositivo instanceof Computador) {
                computador++;
            } else if (dispositivo instanceof Impressora) {
                impressora++;
            } else if (dispositivo instanceof Roteador) {
                roteador++;
            }
        }
        
        //separados para mais organização
        System.out.println("-- DADOS GERAIS --");
        System.out.println("Total Cadastrado: " + di.size());
        System.out.println("Quantidade de Computadores: " + computador);
        System.out.println("Quantidade de Impressoras: " + impressora);
        System.out.println("Quantidade de Roteadores: " + roteador);

        System.out.println("-- Percentual --");
        System.out.println("Computador: " + computador + " Percentual: " + ((computador * 100) / di.size()) + "%");
        System.out.println("Impressora: " + impressora + " Percentual: " + ((impressora * 100) / di.size()) + "%");
        System.out.println("Roteador: " + roteador + " Percentual: " + ((roteador * 100) / di.size()) + "%");

    }

    public static void listarCadastrados(ArrayList<Dispositivo> d) {
        //função para facilitar e otimizar código

        if (d.isEmpty()) {
            System.out.println("Nenhum dispositivo foi cadastrado ainda!");
        } else {
            System.out.println("-- CADASTRADOS --");
            for (Dispositivo dispositivo : d) {
                dispositivo.exibirDetalhes();
            }
        }
    }
}