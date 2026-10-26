public class Computador extends Dispositivo implements Operavel{

    private int quantidadeMemoriaRAM;
    private String sistemaOperacional;

    public Computador(int codigo, String nome, String fabricante, boolean Status, int quantidadeMemoriaRAM, String sistemaOperacional) {
        super(codigo, nome, fabricante, Status);
        this.quantidadeMemoriaRAM = quantidadeMemoriaRAM;
        this.sistemaOperacional = sistemaOperacional;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Código: "+getCodigo()+"\nNome: "+getNome()+"\nFabricante: "+getFabricante()
                            +"\nQuantidade de Memória RAM: "+);
        
    }

    @Override
    public void exibirStatus() {
        System.out.println("Status do Computador: "+(isStatus() ? "ON" : "OFF"));
    }

    @Override
    public void desligar() {
        setStatus(false);
    }

    @Override
    public void ligar() {
        setStatus(true);
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
