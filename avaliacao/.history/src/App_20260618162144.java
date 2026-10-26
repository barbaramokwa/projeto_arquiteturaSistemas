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
            System.out.println("8- Relatório Geral");
            System.out.println("9- Sair");

            opcaoMenu = sc.nextInt();
            sc.nextLine();

            switch(opcaoMenu){
                case 1:
                    System.out.println("== CADASTRANDO COMPUTADOR ==");

                    System.out.println("Nome do Computador: ");
                    String nome = sc.nextLine();

                    System.out.println("Fabricante: ");
                    String fab = sc.nextLine();

                    System.out.println("Quantidade de Memória RAM: ");
                    String quant = sc.nextLine();

                    System.out.println("Sistema Operacional: ");
                    String os = sc.nextLine();

                    id++;

                    Computador com = new Computador(id, nome, fab, false, quant, os);
                    dispo.add(com);

                    System.out.println("Computador cadastrado com sucesso!");

                    break;
                case 2:
                    System.out.println("== CADASTRANDO IMPRESSORA ==");

                    System.out.println("Nome da Impressora: ");
                    String nome2 = sc.nextLine();

                    System.out.println("Fabricante: ");
                    String fabr = sc.nextLine();

                    System.out.println("Tipo de Impressão: (Laser ou Jato)");
                    String tipo = sc.nextLine();

                    System.out.println("Velocidade de Impressão: ");
                    double velocidade = sc.nextDouble();

                    sc.nextLine();

                    id++;

                    Impressora im = new Impressora(id, nome2,fabr, false, tipo, velocidade);
                    dispo.add(im);

                    System.out.println("Impressora cadastrada com sucesso!");
                    break;
                case 3:
                    System.out.println("== CADASTRANDO ROTEADOR ==");

                    System.out.println("Nome do Roteador: ");
                    String nome3 = sc.nextLine();

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
                    break;
                case 4:
                    listarCadastrados(dispo);
                    break;
                case 5:
                    System.out.println("== LIGANDO OS DISPOSITIVOS ==");
                    listarCadastrados(dispo);

                    System.out.println("Informe o CÓDIGO do dispositivo que deseja ligar: ");
                    int codBuscado = sc.nextInt();
                    boolean achado = false;

                    for (Dispositivo dispositivo : dispo) {
                        if(codBuscado == dispositivo.getCodigo()){
                            achado = true;
                            dispositivo.ligar();
                            System.out.println("Dispositivo Ligado com sucesso!");
                            dispositivo.exibirStatus();
                            break;
                        }
                    }

                    if(achado == false){
                        System.out.println("Dispositivo não encontrado");
                    }
                    
                    break;
                case 6:
                    System.out.println("== DESLIGANDO OS DISPOSITIVOS ==");
                    listarCadastrados(dispo);

                    System.out.println("Informe o CÓDIGO do dispositivo que deseja desligar: ");
                    int codBuscado2 = sc.nextInt();
                    boolean achado2 = false;

                    for (Dispositivo dispositivo : dispo) {
                        if(codBuscado2 == dispositivo.getCodigo()){
                            achado2 = true;
                            dispositivo.desligar();
                            System.out.println("Dispositivo desligado com sucesso!");
                            dispositivo.exibirStatus();
                            break;
                        }
                    }

                    if(achado2 == false){
                        System.out.println("Dispositivo não encontrado");
                    }
                    break;
                case 7:
                    System.out.println("== EXIBINDO DETALHES DE 1 DISPOSITIVO ==");

                    System.out.println("Informe o códido do dispositivo que deseja exibir: ");
                    int codE = sc.nextInt();
                    sc.nextLine();

                    boolean achadoE = false;

                    for (Dispositivo dispositivo : dispo) {
                        if(codE == dispositivo.getCodigo()){
                            achadoE = true;
                            dispositivo.exibirDetalhes();
                        }
                    }

                    if(!achadoE){
                        System.out.println("Não encontrado!");
                    }
                    System.out.println("");
                    break;
                case 8:
                    System.out.println("== GERANDO RELATÓRIO ==");

                    break;
                case 9:
                    System.out.println("Saindooo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente!");
            }

        }while(opcaoMenu != 9);
        sc.close();
    }

    public void gerarRelatorio(ArrayList<Dispositivo> di){

        for (Dispositivo dispositivo : di) {
            
        }

        System.out.println("Total Cadastrado: "+di.size());
        System.out.println("Quantidade de Computadores: ");
        System.out.println("Quantidade de Impressoras: ");
        System.out.println("Quantidade de Roteadores: ");


    }

    public static void listarCadastrados(ArrayList<Dispositivo> d){

        if(d.isEmpty()){
            System.out.println("Nenhum dispositivo foi cadastrado ainda!");
        }else{
            System.out.println("-- CADASTRADOS --");
            for (Dispositivo dispositivo : d) {
                dispositivo.exibirDetalhes();
            }
        }
    }
}