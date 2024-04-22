public class BilletForsalg implements Billet{
    private String billetId;
    private int dageTilEvent;

public BilletForsalg (String billetId, int dageTilEvent) {
    this.billetId = billetId;
    this.dageTilEvent = dageTilEvent;
}

    @Override
    public double billetPris() {
        if (dageTilEvent < 10) {
            return 120;
        } else {
            return 120 * (1-0.15);
        }
    }

    @Override
    public String toString() {
        return "Billettype: Forsalg, Billet ID: " + billetId + ", Pris " + billetPris() + " kr.";
    }
}
