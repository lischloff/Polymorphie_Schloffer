//Author: Lisa Schloffer
//Project: Polymorphie_Schloffer
//13.09.2024 | Eibiswald

public class Fisch extends Tier {
    public Fisch(String name, int alter) {
        super(name, alter);
    }

    @Override
    public void gibLaut() {
        System.out.println("Der Fisch blubbert.");
    }
}

