public class Guitarra extends Instrumento {
    public Guitarra(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void play() {
        System.out.println("Playing the guitar: " + getNome());
    }
}
