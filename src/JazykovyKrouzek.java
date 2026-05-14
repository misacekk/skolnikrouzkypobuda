public class JazykovyKrouzek extends Krouzek {
    private String jazyk;
    private boolean rodilyMluvci;

    public JazykovyKrouzek(String nazev, String vedouci, int pocetZaku, int cenaZaZaka, int pocetMesicu, String jazyk, boolean rodilyMluvci) {
        super(nazev, vedouci, pocetZaku, cenaZaZaka, pocetMesicu);
        this.jazyk = jazyk;
        this.rodilyMluvci = rodilyMluvci;
    }

    @Override
    public int vypoctiRocniNaklady() {
        return (pocetZaku * cenaZaZaka * pocetMesicu) + (rodilyMluvci ? 8000 : 0);
    }

    @Override
    public void vypisInformace() {
        System.out.println("Jazykový kroužek:");
        super.vypisInformace();
        System.out.println("Jazyk: " + jazyk);
        System.out.println("Rodilý mluvčí: " + (rodilyMluvci ? "ano" : "ne"));
    }
}