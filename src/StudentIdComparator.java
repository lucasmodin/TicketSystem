import java.util.Comparator;

public class StudentIdComparator implements Comparator<BilletForsalgStudierabat> {
    @Override
    public int compare(BilletForsalgStudierabat o1, BilletForsalgStudierabat o2) {
        return o1.getStudieKortId().compareTo(o2.getStudieKortId());
    }
}
