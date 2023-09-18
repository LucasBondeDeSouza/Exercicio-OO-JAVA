public class Moto extends Veiculo {
    
    private String cilindradas;

    public Moto() {
    }

    public Moto(String nome, int ano, String modelo, String marca) {
        super(nome, ano, modelo, marca);
    }

    public Moto(String nome, int ano, String modelo, String marca, String cilindradas) {
        super(nome, ano, modelo, marca);
        this.cilindradas = cilindradas;
    }

    public String getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(String cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public String toString() {
        return "\n********* Moto *********" +
               "\n\nNome: " + getNome() +
               "\nAno: " + getAno() +
               "\nModelo: " + getModelo() +
               "\nMarca: " + getMarca() +
               "\nCilindradas: " + getCilindradas();
    }

}
