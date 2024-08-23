import java.util.ArrayList;

public class Main {

    public int nOcorrencias(ArrayList<Integer> l, Integer el) {
        int count = 0;

        for (Integer num : l) {
            if (num.equals(el)) {
                count++;
            }
        }

        return count;
    }

    public boolean hasRepeat(ArrayList<Integer> l) {
        return true;
    }

    public int nroRepeat(ArrayList<Integer> l) {
        return 0;
    }

    public ArrayList<Integer> listRepeat(ArrayList<Integer> l) {
        return new ArrayList<>();
    }

    public ArrayList<Integer> union(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        return new ArrayList<>();
    }

    public ArrayList<Integer> intersect(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        return new ArrayList<>();
    }
}
