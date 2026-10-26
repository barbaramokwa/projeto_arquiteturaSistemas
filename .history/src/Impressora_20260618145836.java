public class Impressora extends Dispositivo implements Operavel{

    private String tipoImpressao;
    private double velocidadeImpressao;
    
    public Impressora(int codigo, String nome, String fabricante, String tipoImpressao, double velocidadeImpressao) {
        super(codigo, nome, fabricante);
        this.tipoImpressao = tipoImpressao;
        this.velocidadeImpressao = velocidadeImpressao;
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
