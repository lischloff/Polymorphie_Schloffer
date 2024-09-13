import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Wähle ein Tier: Katze, Hund, Kuh, Fisch, Schwein");
                String wahl = scanner.nextLine();

                Tier tier = null;

                switch (wahl.toLowerCase()) {
                    case "katze":
                        tier = new Katze("Katze", 3);
                        break;
                    case "hund":
                        tier = new Hund("Hund", 5);
                        break;
                    case "kuh":
                        tier = new Kuh("Kuh", 4);
                        break;
                    case "fisch":
                        tier = new Fisch("Fisch", 1);
                        break;
                    case "schwein":
                        tier = new Schwein("Schwein", 2);
                        break;
                    default:
                        System.out.println("Ungültige Auswahl.");
                        System.exit(0);
                }

                tier.gibLaut();
                scanner.close();
    }
}