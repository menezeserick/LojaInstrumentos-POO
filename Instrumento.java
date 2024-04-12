public class Instrumento {
    private String nome;
    private double preco;

    public Instrumento(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public abstract void play();
}

