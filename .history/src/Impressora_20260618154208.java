public class Impressora extends Dispositivo implements Operavel{

    private int tipoImpressao;
    private double velocidadeImpressao;
    
    public Impressora(int codigo, String nome, String fabricante, boolean Status, int tipoImpressao, double velocidadeImpressao) {
        super(codigo, nome, fabricante, Status);
        this.tipoImpressao = tipoImpressao;
        this.velocidadeImpressao = velocidadeImpressao;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Código: "+getCodigo()+"\nNome: "+getNome()+"\nFabricante: "+getFabricante()
                                +"\nTipo de Impressão: "+tipoImpressao+"\nVelocidade de Impressão:"+velocidadeImpressao);
        
    }

    @Override
    public void desligar() {
        setStatus(false);
        
    }

    @Override
    public void exibirStatus() {
        System.out.println("Status da Imptressora: "+(isStatus() ? "ON" : "OFF"));
        
    }

    @Override
    public void ligar() {
        setStatus(true);
        
    }

    public int getTipoImpressao() {
        return tipoImpressao;
    }

    public void setTipoImpressao(int tipoImpressao) {
        this.tipoImpressao = tipoImpressao;
    }

    public double getVelocidadeImpressao() {
        return velocidadeImpressao;
    }

    public void setVelocidadeImpressao(double velocidadeImpressao) {
        this.velocidadeImpressao = velocidadeImpressao;
    }

}