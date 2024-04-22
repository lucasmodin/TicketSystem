public class BilletIDøren implements Billet {


private String billetId;


public BilletIDøren(String billetId) {
    this.billetId = billetId;
}

    @Override
    public double billetPris() {
        return 150;
    }


    @Override
    public String toString() {
        return "Billettype: Døren, Billet ID: " + billetId + ", Pris " + billetPris() + " kr.";
    }
}
