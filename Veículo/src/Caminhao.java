public class Caminhao extends Veiculo {
    
    private int qtdEixo;

    public Caminhao() {
    }

    public Caminhao(String nome, int ano, String modelo, String marca, int qtdEixo) {
        super(nome, ano, modelo, marca);
        this.qtdEixo = qtdEixo;
    }

    public int getQtdEixo() {
        return qtdEixo;
    }

    public void setQtdEixo(int qtdEixo) {
        this.qtdEixo = qtdEixo;
    }

    @Override
    public String toString() {
        return "********* Caminhao *********" +
               "\n\nNome: " + getNome() +
               "\nAno: " + getAno() +
               "\nModelo: " + getModelo() +
               "\nMarca: " + getMarca() +
               "\nQuantidade de Eixo: " + getQtdEixo();
    }
}
