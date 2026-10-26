public class Impressora extends Dispositivo implements Operavel{

    private String tipoImpressao;
    private double velocidadeImpressao;
    
    public Impressora(int codigo, String nome, String fabricante, boolean Status, String tipoImpressao, double velocidadeImpressao) {
        super(codigo, nome, fabricante, Status);
        this.tipoImpressao = tipoImpressao;
        this.velocidadeImpressao = velocidadeImpressao;
    }

    

    @Override
    public void exibirDetalhes() {
        System.out.println("Código: "+getCodigo()+"\nNome: "+getNome()+"\nFabricante: "+get);
        
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
