import java.util.Comparator;

public class IdComparator implements Comparator<Billet> {

    @Override
    public int compare(Billet o1, Billet o2) {
        return o1.getId().compareTo(o2.getId());
    }
}
