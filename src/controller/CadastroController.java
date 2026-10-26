package controller;

import java.util.Scanner;

import exceptions.NumeroNegativo;
import model.Computador;
import model.Dispositivo;
import model.Impressora;
import model.Roteador;
import service.GerenciadorDispositivos;
import util.LeitorConsole;

public class CadastroController {

    Scanner sc = new Scanner(System.in);

    public static void cadastrarComputador(GerenciadorDispositivos gerenciador, Scanner sc) throws NumeroNegativo {
        System.out.println("\n== CADASTRANDO COMPUTADOR ==");
        System.out.print("Nome do Computador: ");
        String nome = sc.nextLine();

        if (nome.isEmpty()) {
            System.out.println("Insira um nome válido.");
            return;
        }
        
        System.out.print("Fabricante: ");
        String fabricante = sc.nextLine();

        int quantidadeRAM = LeitorConsole.lerInteiro(sc, "Quantidade de Memória RAM (GB): ");
        

        System.out.print("Sistema Operacional: ");
        String sistemaOperacional = sc.nextLine();

        gerenciador.adicionar(new Computador(nome, fabricante, false, quantidadeRAM, sistemaOperacional));
        System.out.println("Computador cadastrado com sucesso!");
    }

    public static void cadastrarImpressora(GerenciadorDispositivos gerenciador, Scanner sc) throws NumeroNegativo {
        System.out.println("\n== CADASTRANDO IMPRESSORA ==");
        System.out.print("Nome da Impressora: ");
        String nome = sc.nextLine();

        if (nome.isEmpty()) {
            System.out.println("Insira um nome válido.");
            return;
        }

        System.out.print("Fabricante: ");
        String fabricante = sc.nextLine();

        System.out.print("Tipo de Impressão: ");
        String tipoImpressao = sc.nextLine();

        double velocidadeImpressao = LeitorConsole.lerDouble(sc, "Velocidade de Impressão (ppm): ");

        gerenciador.adicionar(new Impressora(nome, fabricante, false, tipoImpressao, velocidadeImpressao));
        System.out.println("Impressora cadastrada com sucesso!");
    }

    public static void cadastrarRoteador(GerenciadorDispositivos gerenciador, Scanner sc) throws NumeroNegativo {
        System.out.println("\n== CADASTRANDO ROTEADOR ==");
        System.out.print("Nome do Roteador: ");
        String nome = sc.nextLine();

        if (nome.isEmpty()) {
            System.out.println("Insira um nome válido.");
            return;
        }

        System.out.print("Fabricante: ");
        String fabricante = sc.nextLine();

        int quantidadePortas = LeitorConsole.lerInteiro(sc, "Quantidade de Portas: ");

        double velocidadeRede = LeitorConsole.lerDouble(sc, "Velocidade de Rede (Mbps): ");

        gerenciador.adicionar(new Roteador(nome, fabricante, false, quantidadePortas, velocidadeRede));
        System.out.println("Roteador cadastrado com sucesso!");
    }

    public static void listarDispositivos(GerenciadorDispositivos gerenciador) {
        System.out.println("\n== LISTA DE DISPOSITIVOS ==");
        if (gerenciador.estaVazio()) {
            System.out.println("Nenhum dispositivo cadastrado.");
            return;
        }
        for (Dispositivo dispositivo : gerenciador.listarTodos()) {
            System.out.println("\nCódigo: " + dispositivo.getCodigo());
            System.out.println("Nome: " + dispositivo.getNome());
            System.out.println("Fabricante: " + dispositivo.getFabricante());
            dispositivo.exibirDetalhesEspecificos();
        }
    }

    public static void buscarDispositivo(GerenciadorDispositivos gerenciador, Scanner sc) {
        System.out.println("\n== BUSCAR DISPOSITIVO ==");
        Dispositivo dispositivo = solicitarEBuscar(gerenciador, sc);

        if (dispositivo != null) {
            dispositivo.exibirDetalhes();
        } else {
            System.out.println("Dispositivo não encontrado.");
        }
    }

    public static void ligarDispositivo(GerenciadorDispositivos gerenciador, Scanner sc) {
        System.out.println("\n== LIGAR DISPOSITIVO ==");
        Dispositivo dispositivo = solicitarEBuscar(gerenciador, sc);

        if (dispositivo != null) {
            dispositivo.ligar();
            System.out.println("Dispositivo ligado com sucesso!");
        } else {
            System.out.println("Dispositivo não encontrado.");
        }
    }

    public static void desligarDispositivo(GerenciadorDispositivos gerenciador, Scanner sc) {
        System.out.println("\n== DESLIGAR DISPOSITIVO ==");
        Dispositivo dispositivo = solicitarEBuscar(gerenciador, sc);

        if (dispositivo != null) {
            dispositivo.desligar();
            System.out.println("Dispositivo desligado com sucesso!");
        } else {
            System.out.println("Dispositivo não encontrado.");
        }
    }

    private static Dispositivo solicitarEBuscar(GerenciadorDispositivos gerenciador, Scanner sc) {
        int codigo = LeitorConsole.lerInteiro(sc, "Digite o código do dispositivo: ");
        return gerenciador.buscarPorCodigo(codigo);
    }   
}