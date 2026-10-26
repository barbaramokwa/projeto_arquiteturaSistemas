public abstract class Dispositivo {
    
    private int codigo;
    private String nome;
    private String fabricante;
    private boolean Status;
    
    public Dispositivo(int codigo, String nome, String fabricante, boolean status) {
        this.codigo = codigo;
        this.nome = nome;
        this.fabricante = fabricante;
    }

    public abstract void exibirDetalhes();

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    
}
