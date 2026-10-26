public class Roteador extends Dispositivo implements Operavel{

    private int quantidadePortas;
    private double velocidadeRede;
    
    public Roteador(int codigo, String nome, String fabricante, boolean Status, int quantidadePortas, double velocidadeRede) {
        super(codigo, nome, fabricante, St);
        this.quantidadePortas = quantidadePortas;
        this.velocidadeRede = velocidadeRede;
    }

    

    @Override
    public void exibirDetalhes() {
        // TODO Auto-generated method stub
        
    }



    @Override
    public void desligar() {
        // TODO Auto-generated method stub
        
    }



    @Override
    public void exibirStatus() {
        // TODO Auto-generated method stub
        
    }



    @Override
    public void ligar() {
        // TODO Auto-generated method stub
        
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
