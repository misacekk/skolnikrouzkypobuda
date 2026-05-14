public class SportovniKrouzek extends Krouzek {
    private boolean potrebaTelocvicny;

    public SportovniKrouzek(String nazev, String vedouci, int pocetZaku, int cenaZaZaka, int pocetMesicu, boolean potrebaTelocvicny) {
        super(nazev, vedouci, pocetZaku, cenaZaZaka, pocetMesicu);
        this.potrebaTelocvicny = potrebaTelocvicny;
    }

    @Override
    public int vypoctiRocniNaklady() {
        return (pocetZaku * cenaZaZaka * pocetMesicu) + (potrebaTelocvicny ? 12000 : 0);
    }

    @Override
    public void vypisInformace() {
        System.out.println("Sportovní kroužek:");
        super.vypisInformace();
        System.out.println("Pronájem tělocvičny: " + (potrebaTelocvicny ? "ano" : "ne"));
    }
}