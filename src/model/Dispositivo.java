package model;

import interfaces.Operavel;

public abstract class Dispositivo implements Operavel {

    private static int contador = 0;

    private int codigoDispositivo;
    private String nomeDispositivo;
    private String fabricanteDispositivo;
    private boolean statusDispositivo;

    
    public Dispositivo(String nomeDispositivo, String fabricanteDispositivo, boolean statusDispositivo) {
        this.codigoDispositivo = ++contador;
        this.nomeDispositivo = nomeDispositivo;
        this.fabricanteDispositivo = fabricanteDispositivo;
        this.statusDispositivo = false;
    }

    public void exibirDetalhes() {
        System.out.println("Código do Dispositivo: " + codigoDispositivo);
        System.out.println("Nome do Dispositivo: " + nomeDispositivo);
        System.out.println("Fabricante do Dispositivo: " + fabricanteDispositivo);
        System.out.println("Status do Dispositivo: " + (statusDispositivo ? "Ligado" : "Desligado"));
        exibirDetalhesEspecificos();
    }

    public abstract void exibirDetalhesEspecificos();

    @Override
    public void desligar() {
        setStatus(false);
    }

     @Override
    public void ligar() {
        setStatus(true);
    }

    public int getCodigo() {
        return codigoDispositivo;
    }

    public void setCodigo(int codigoDispositivo) {
        this.codigoDispositivo = codigoDispositivo;
    }

    public String getNome() {
        return nomeDispositivo;
    }

    public void setNome(String nomeDispositivo) {
        this.nomeDispositivo = nomeDispositivo;
    }

    public String getFabricante() {
        return fabricanteDispositivo;
    }

    public void setFabricante(String fabricanteDispositivo) {
        this.fabricanteDispositivo = fabricanteDispositivo;
    }

    public boolean isStatus() {
        return statusDispositivo;
    }

    public void setStatus(boolean statusDispositivo) {
        this.statusDispositivo = statusDispositivo;
    }
}