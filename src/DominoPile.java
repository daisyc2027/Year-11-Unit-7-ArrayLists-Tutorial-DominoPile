import java.util.ArrayList;

public class DominoPile {
    private final ArrayList<Domino> pile;

    public DominoPile() {
        pile = new ArrayList<>();
    }

    public ArrayList<Domino> getPile() {
        return pile;
    }

    public void newStack6() {
        for (int i = 0; i <= 6; i++) {
            for (int j = i; j <= 6; j++) {
                pile.add(new Domino(i, j));
            }
        }
    }

    public void shuffle() {
        for (int i = 0; i < 100; i++) {
            int randIndex1 = (int) (Math.random() * pile.size());
            int randIndex2 = (int) (Math.random() * pile.size());

            Domino temp = pile.get(randIndex1);
            pile.set(randIndex1, pile.get(randIndex2));
            pile.set(randIndex2, temp);
        }
    }
}