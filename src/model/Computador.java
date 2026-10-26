package model;

import exceptions.NumeroNegativo;

public class Computador extends Dispositivo {

    private int quantidadeMemoriaRAM;
    private String sistemaOperacional;

    public Computador(String nomeDispositivo, String fabricanteDispositivo, boolean statusDispositivo, int quantidadeMemoriaRAM,
            String sistemaOperacional) throws NumeroNegativo { 
        super(nomeDispositivo, fabricanteDispositivo, statusDispositivo);
        if(quantidadeMemoriaRAM < 0){
            throw new NumeroNegativo("A quantidade de memória RAM não pode ser negativa"); 
        }else{
            this.quantidadeMemoriaRAM = quantidadeMemoriaRAM;
        }
        this.sistemaOperacional = sistemaOperacional;
    }

    @Override 
    public void exibirDetalhesEspecificos() {
        System.out.println("Quantidade de Memória RAM: " + quantidadeMemoriaRAM + " GB");
        System.out.println("Sistema Operacional: " + sistemaOperacional);
    }
    
    public int getQuantidadeMemoriaRAM() {
        return quantidadeMemoriaRAM;
    }

    public void setQuantidadeMemoriaRAM(int quantidadeMemoriaRAM) {
        this.quantidadeMemoriaRAM = quantidadeMemoriaRAM;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }
}