public abstract class Veiculo {
    
    private String nome;
    private int ano;
    private String modelo;
    private String marca;
    
    public Veiculo() {
    }

    public Veiculo(String nome, int ano, String modelo, String marca) {
        this.nome = nome;
        this.ano = ano;
        this.modelo = modelo;
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Veiculo [nome=" + nome + ", ano=" + ano + ", modelo=" + modelo + ", marca=" + marca + "]";
    }

    
}
