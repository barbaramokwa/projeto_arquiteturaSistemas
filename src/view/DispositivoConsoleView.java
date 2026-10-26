package view;

import model.Dispositivo;
import model.Computador;
import model.Impressora;
import model.Roteador;

public class DispositivoConsoleView {

    public void exibirDetalhes(Dispositivo dispositivo){

        if(dispositivo == null){
            System.out.println("Dispositivo não encontrado.");
            return;
        }

        System.out.println("Código: " + dispositivo.getCodigo());
        System.out.println("Nome: " + dispositivo.getNome());
        System.out.println("Fabricante: " + dispositivo.getFabricante());

        if(dispositivo instanceof Computador computador){
        
            System.out.println("Quantidade de Memória RAM: " + computador.getQuantidadeMemoriaRAM() + "GB");
            System.out.println("Sistema Operacional: " + computador.getSistemaOperacional());
        } else if(dispositivo instanceof Impressora impressora){
            
            System.out.println("Tipo de Impressão: " + impressora.getTipoImpressao());
            System.out.println("Velocidade de Impressão: " + impressora.getVelocidadeImpressao());
        } else if(dispositivo instanceof Roteador roteador){
           
            System.out.println("Quantidade de Portas: " + roteador.getQuantidadePortas());
            System.out.println("Velocidade de Rede: " + roteador.getVelocidadeRede());
        }
    }

    public void exibirStatus(Dispositivo dispositivo) {
        if (dispositivo != null) {
            System.out.println("Status: " + (dispositivo.isStatus() ? "ON" : "OFF"));
        }
    }
    
}
