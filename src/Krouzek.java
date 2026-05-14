public abstract class Krouzek {
    protected String nazev;
    protected String vedouci;
    protected int pocetZaku;
    protected int cenaZaZaka;
    protected int pocetMesicu;

    public Krouzek(String nazev, String vedouci, int pocetZaku, int cenaZaZaka, int pocetMesicu) {
        this.nazev = nazev;
        this.vedouci = vedouci;
        this.pocetZaku = pocetZaku;
        this.cenaZaZaka = cenaZaZaka;
        this.pocetMesicu = pocetMesicu;
    }

    public abstract int vypoctiRocniNaklady();

    public void vypisInformace() {
        System.out.println("Název: " + nazev);
        System.out.println("Vedoucí: " + vedouci);
        System.out.println("Počet žáků: " + pocetZaku);
        System.out.println("Cena za žáka na měsíc: " + cenaZaZaka + " Kč");
        System.out.println("Počet měsíců: " + pocetMesicu);
    }

    public String getNazev() {
        return nazev;
    }

    public int getPocetZaku() {
        return pocetZaku;
    }
}