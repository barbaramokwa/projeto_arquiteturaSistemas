package model;
import exceptions.NumeroNegativo;
public class Impressora extends Dispositivo {

    private String tipoImpressao;
    private double velocidadeImpressao;
    
    public Impressora(String nomeDispositivo, String fabricanteDispositivo, boolean statusDispositivo, String tipoImpressao,
            double velocidadeImpressao) throws NumeroNegativo {
        super(nomeDispositivo, fabricanteDispositivo, statusDispositivo);
        this.tipoImpressao = tipoImpressao;
        if(velocidadeImpressao < 0){
            throw new NumeroNegativo("A velocidade de impressão não pode ser negativa"); 
        }else{
            this.velocidadeImpressao = velocidadeImpressao;
        }
    }
    
    @Override 
    public void exibirDetalhesEspecificos() {
        System.out.println("Tipo de Impressão: " + tipoImpressao);
        System.out.println("Velocidade de Impressão: " + velocidadeImpressao + " ppm");
    }
   
    public String getTipoImpressao() {
        return tipoImpressao;
    }

    public void setTipoImpressao(String tipoImpressao) {
        this.tipoImpressao = tipoImpressao;
    }

    public double getVelocidadeImpressao() {
        return velocidadeImpressao;
    }

    public void setVelocidadeImpressao(double velocidadeImpressao) {
        this.velocidadeImpressao = velocidadeImpressao;
    }
}