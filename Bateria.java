public class Bateria extends Instrumento{
    public Bateria(String nome, double preco){
        super(nome, preco);
    }
    @Override
    public void play() {
        System.out.println("Playing the drum: " + getNome());
    }
}
