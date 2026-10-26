public class Roteador extends Dispositivo implements Operavel{

    private int quantidadePortas;
    private double velocidadeRede;
    
    public Roteador(int codigo, String nome, String fabricante, boolean Status, int quantidadePortas, double velocidadeRede) {
        super(codigo, nome, fabricante, Status);
        this.quantidadePortas = quantidadePortas;
        this.velocidadeRede = velocidadeRede;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Código: "+getCodigo()+"\nNome: "+getNome()+"\nFabricante: "+getFabricante()
                            +"\nQuantidade de Portas: "+quantidadePortas+"\nVelocidade de Rede: "+velocidadeRede);
    }

    @Override
    public void desligar() {
        setStatus(false);
    }



    @Override
    public void exibirStatus() {
        System.out.println("Status do Roteador: "+(isStatus() ? "ON" : "OFF"));
    }



    @Override
    public void ligar() {
        setStatus(true);
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
