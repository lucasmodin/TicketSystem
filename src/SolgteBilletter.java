import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SolgteBilletter {

    private ArrayList<Billet> solgteBilletter;

    public SolgteBilletter() {
        solgteBilletter = new ArrayList<>();
    }

    public void tilføjBillet(Billet billet) {
        solgteBilletter.add(billet);
    }

    public ArrayList<Billet> getBilletter(){
        return solgteBilletter;
    }


    public void antalSolgteBilletter(){
        int dørenCount = 0;
        int forsalgCount = 0;
        int forsalgStudieRabatCount = 0;


        for (Billet billet : solgteBilletter) {
            if (billet instanceof BilletIDøren) {
                dørenCount ++;
            } else if (billet instanceof BilletForsalg) {
                forsalgCount ++;
            } else if (billet instanceof BilletForsalgStudierabat) {
                forsalgStudieRabatCount ++;
            }
        }

        System.out.println("Antal billetter solgt i døren: " + dørenCount);
        System.out.println("Antal billetter solgt i forsalg: " + forsalgCount);
        System.out.println("Antal billetter solgt i forsalg med studierabat: " + forsalgStudieRabatCount);


    }

    public String hentAlleStudiekortId() {
        String result = "";

        ArrayList<String> studieKortIdList = new ArrayList<>();

        for (Billet billet : solgteBilletter) {
            if(billet instanceof BilletForsalgStudierabat) {
                String studieId = ((BilletForsalgStudierabat) billet).getStudieKortId();
                studieKortIdList.add(studieId);
            }
        } for (String studieId : studieKortIdList ) {
            result += studieId + ", ";
        }
        return result;
    }




    @Override
    public String toString() {
        String result = "";
        for(Billet billet : solgteBilletter) {
            result += billet.toString() + "\n";
        }
        return result;
    }


}
