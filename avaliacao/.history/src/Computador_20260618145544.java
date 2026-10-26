public class Computador extends Dispositivo implements Operavel{

    private int quantidadeMemoriaRAM;
    private String sistemaOperacional;
    
    public Computador(int codigo, String nome, String fabricante, int quantidadeMemoriaRAM, String sistemaOperacional) {
        super(codigo, nome, fabricante);
        this.quantidadeMemoriaRAM = quantidadeMemoriaRAM;
        this.sistemaOperacional = sistemaOperacional;
    }

    
    
}
