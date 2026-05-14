public class HudebniKrouzek extends Krouzek {
    private String nastroj;
    private boolean pujcujeNastroje;

    public HudebniKrouzek(String nazev, String vedouci, int pocetZaku, int cenaZaZaka, int pocetMesicu, String nastroj, boolean pujcujeNastroje) {
        super(nazev, vedouci, pocetZaku, cenaZaZaka, pocetMesicu);
        this.nastroj = nastroj;
        this.pujcujeNastroje = pujcujeNastroje;
    }

    @Override
    public int vypoctiRocniNaklady() {
        return (pocetZaku * cenaZaZaka * pocetMesicu) + (pujcujeNastroje ? 15000 : 0);
    }

    @Override
    public void vypisInformace() {
        System.out.println("Hudební kroužek:");
        super.vypisInformace();
        System.out.println("Hudební nástroj: " + nastroj);
        System.out.println("Škola půjčuje nástroje: " + (pujcujeNastroje ? "ano" : "ne"));
    }
}