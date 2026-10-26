public class Roteador extends Dispositivo implements Operavel{

    private int quantidadePortas;
    private double velocidadeRede;
    
    public Roteador(int codigo, String nome, String fabricante, int quantidadePortas, double velocidadeRede) {
        super(codigo, nome, fabricante);
        this.quantidadePortas = quantidadePortas;
        this.velocidadeRede = velocidadeRede;
    }

    
    
}
