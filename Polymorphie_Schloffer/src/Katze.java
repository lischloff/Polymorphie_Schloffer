public class Katze extends Tier {
    public Katze(String name, int alter) {
        super(name, alter);
    }
    // Implementierung der abstrakten Methode gibLaut() aus der Basisklasse Tier
    // Hier wird definiert, wie eine Katze ihren Laut macht
    @Override
    public void gibLaut() {
        System.out.println("Die Katze miaut.");
    }
}
