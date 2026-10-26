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
        // TODO Auto-generated method stub
        
    }



    @Override
    public void desligar() {
        setStatus();
        
    }



    @Override
    public void exibirStatus() {
        // TODO Auto-generated method stub
        
    }



    @Override
    public void ligar() {
        // TODO Auto-generated method stub
        
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
