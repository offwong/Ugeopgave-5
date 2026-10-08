import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Lion("Simba", 80));
        animals.add(new Wolf("Wuff", 80));
        animals.add(new Rabbit("Rabbet", 80));
        animals.add(new Lion("Shealaa", 80));

        for (int i = 0; i < animals.size(); i += 2) {
            Animal first = animals.get(i);
            Animal second = animals.get(i + 1);

            Contest contest = new Contest(first, second);

            while (first.isActive() && second.isActive()) {
                contest.playRound();
            }

            Animal winner = contest.getWinner();
            if (winner == null) {
                System.out.println("Ingen Vinder :( ");
            } else {
                System.out.println("Vinderen er: " + winner);
            }
            System.out.println();
        }

    }

}
