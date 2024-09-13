public class Kuh extends Tier {
    public Kuh(String name, int alter) {
        super(name, alter);
    }

    @Override
    public void gibLaut() {
        System.out.println("Die Kuh muht.");
    }
}

