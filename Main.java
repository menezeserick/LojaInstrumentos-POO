public class Main{
    public static void Main(String[] args) {
        Instrumento guitarra = new Guitarra("Fender", 500.0);
        Instrumento bateria = new Bateria("Pearl", 300.0);

        guitarra.play();
        bateria.play();
    }
}