public class Computador extends Dispositivo implements Operavel{

    private int quantidadeMemoriaRAM;
    private String sistemaOperacional;

    public Computador(int codigo, String nome, String fabricante, int quantidadeMemoriaRAM, String sistemaOperacional) {
        super(codigo, nome, fabricante);
        this.quantidadeMemoriaRAM = quantidadeMemoriaRAM;
        this.sistemaOperacional = sistemaOperacional;
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
