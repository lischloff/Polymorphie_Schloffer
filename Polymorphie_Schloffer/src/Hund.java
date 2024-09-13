public class Hund extends Tier {
    public Hund(String name, int alter) {
        super(name, alter);
    }

    @Override
    public void gibLaut() {
        System.out.println("Der Hund bellt.");
    }
}
