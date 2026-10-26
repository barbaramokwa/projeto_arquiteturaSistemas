package model;
import exceptions.NumeroNegativo;
public class Roteador extends Dispositivo {

    private int quantidadePortas;
    private double velocidadeRede;
    
    public Roteador(String nomeDispositivo, String fabricanteDispositivo, boolean statusDispositivo, int quantidadePortas, double velocidadeRede) throws NumeroNegativo {
        super(nomeDispositivo, fabricanteDispositivo, statusDispositivo);
        if(quantidadePortas < 0){
            throw new NumeroNegativo("A quantidade de portas não pode ser negativa");
        }else{
            this.quantidadePortas = quantidadePortas;
        }
        if(velocidadeRede < 0){
            throw new NumeroNegativo("A velocidade de rede não pode ser negativa");
        }else{
            this.velocidadeRede = velocidadeRede;
        }
    }

    @Override 
    public void exibirDetalhesEspecificos() {
        System.out.println("Quantidade de Portas: " + quantidadePortas);
        System.out.println("Velocidade de Rede: " + velocidadeRede + " Mbps");
    }
    
    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    public double getVelocidadeRede() {
        return velocidadeRede;
    }

    public void setVelocidadeRede(double velocidadeRede) {
        this.velocidadeRede = velocidadeRede;
    }
}