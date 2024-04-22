public class BilletForsalgStudierabat implements Billet {

    private String billetId;
    private int dageTilEvent;
    private String studieKortId;


    public BilletForsalgStudierabat (String billetId, int dageTilEvent, String studieKortId) {
        this.billetId = billetId;
        this.dageTilEvent = dageTilEvent;
        this.studieKortId = studieKortId;
    }


    @Override
    public double billetPris() {
        if (dageTilEvent < 10) {
            return 90;
        } else {
            return 90 * (1-0.15);
        }

    }

    public String getStudieKortId() {
        return studieKortId;
    }


    @Override
    public String toString() {
        return "Billettype: Forsalg med studierabat, Billet ID: " + billetId + ", Pris: " + billetPris() + " kr. Husk at medbringe studiekort (" + studieKortId + ").";
    }
}
