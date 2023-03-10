import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {

    public static void main(String[] args) {

        int idx = 0;
        String champ = "";

        while (!StdIn.isEmpty()) {

            String word = StdIn.readString();
            boolean won = StdRandom.bernoulli(1 / (idx + 1.00));

            if (won)
                champ = word;

            idx++;
        }
        System.out.println(champ);

    }

}
