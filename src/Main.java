import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Krouzek> krouzek = new ArrayList<>();

        krouzek.add(new SportovniKrouzek("Fotbal", "Pepa", 18, 200, 10, false));
        krouzek.add(new SportovniKrouzek("Basketbal", "Franta", 12, 250, 10, true));

        krouzek.add(new JazykovyKrouzek("Angličtina", "James", 14, 360, 10, "angličtina", true));
        krouzek.add(new JazykovyKrouzek("Němčina", "Andrlik", 16, 300, 10, "němčina", false));

        krouzek.add(new HudebniKrouzek("Kytara", "Eismann", 12, 180, 10, "kytara", true));
        krouzek.add(new HudebniKrouzek("Klavír", "Musilka", 5, 450, 9, "klavír", false));

        System.out.println("=== VŠECHNY KROUŽKY ===");
        for (Krouzek k : krouzek) {
            k.vypisInformace();
            System.out.println(" ");
        }

        System.out.println(" ");

        System.out.println("=== ROČNÍ NÁKLADY KROUŽKŮ ===");
        for (Krouzek k : krouzek) {
            System.out.println(k.getNazev() + " " + k.vypoctiRocniNaklady() + "Kč");
        }

        System.out.println(" ");

        System.out.println("=== KROUŽKY S ALESPOŇ 15 ŽÁKY ===");
        for (Krouzek k : krouzek) {
            if (k.getPocetZaku() >= 15) {
                System.out.println(k.getNazev() + " " + k.getPocetZaku() + " žáků");
            }
        }

        System.out.println("=== NEJDRAŽŠÍ KROUŽEK ===");
        Krouzek nejdrazsi = krouzek.get(0);
        for (int i = 1; i < krouzek.size(); i++) {
            if (krouzek.get(i).vypoctiRocniNaklady() < nejdrazsi.vypoctiRocniNaklady()) {
                nejdrazsi = krouzek.get(i);
                nejdrazsi.vypisInformace();
            }
        }

        System.out.println(" ");

        System.out.println("=== VYHLEDÁVÁNÍ KROUŽKU PODLE JMÉNA ===");
        System.out.println("(Napiš celý název)");
        String nazev = sc.nextLine();
        boolean nasel = false;
        for (Krouzek k : krouzek) {
            if (k.getNazev().equals(nazev)) {
                k.vypisInformace();
                nasel = true;
            }
        }
        if (!nasel) {
            System.out.println("Špatně zadaný název");
        }

        System.out.println(" ");

        System.out.println("=== ODEBRÁNÍ KROUŽKU PODLE JMÉNA ===");
        System.out.println("(Napiš celý název)");
        String nazev2 = sc.nextLine();
        boolean nasel2 = false;
        for (Krouzek k : krouzek) {
            if (k.getNazev().equals(nazev2)) {
                krouzek.remove(k);
                nasel2 = true;
                System.out.println("Úspěšně odebráno " + k.getNazev());
                break;
            }
        }
        if (!nasel2) {
            System.out.println("Špatně zadaný název nebo takový kroužek neexistuje");
        }
    }
}