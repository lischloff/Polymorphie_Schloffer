public class Schwein extends Tier {
    public Schwein(String name, int alter) {
        super(name, alter);
    }

    @Override
    public void gibLaut() {
        System.out.println("Das Schwein grunzt.");
    }
}
