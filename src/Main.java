import java.util.Collections;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        SolgteBilletter solgteBilletter = new SolgteBilletter();

        Billet dørenBillet = new BilletIDøren("2222f");
        Billet forsalgBillet = new BilletForsalg("233f", random.nextInt(20));
        Billet forsalgStudieRabatBillet = new BilletForsalgStudierabat("3", random.nextInt(20), "123445");
        Billet forsalgStudieRabatBillet2 = new BilletForsalgStudierabat("3", random.nextInt(20), "123446");
        Billet forsalgStudieRabatBillet3 = new BilletForsalgStudierabat("3", random.nextInt(20), "123447");

        solgteBilletter.tilføjBillet(dørenBillet);
        solgteBilletter.tilføjBillet(forsalgBillet);
        solgteBilletter.tilføjBillet(forsalgStudieRabatBillet);
        solgteBilletter.tilføjBillet(forsalgStudieRabatBillet2);
        solgteBilletter.tilføjBillet(forsalgStudieRabatBillet3);


        System.out.println(solgteBilletter);
        solgteBilletter.antalSolgteBilletter();
        System.out.println("Studiekort ID'er: " + solgteBilletter.hentAlleStudiekortId());





    }
}