public abstract class Tier {
    protected String name;
    protected int alter;

    public Tier(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    // Diese Methode muss in allen Unterklassen (wie Hund oder Katze) implementiert werden.
    // Jedes Tier gibt einen eigenen Laut von sich, aber hier wird noch nicht festgelegt, wie dieser Laut klingt.
    public abstract void gibLaut();
}
