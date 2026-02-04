import java.util.HashMap;
import java.util.Map;

public class Election {
    public static String findWinner(String[] votes) {
        if (votes == null) return "";
        if (votes.length == 1) return votes[0];

        HashMap<String, Integer> votoImpresso = new HashMap<>();

        for (String candidate : votes) {
            votoImpresso.put(candidate, votoImpresso.getOrDefault(candidate, 0) + 1);
        }

        return votoImpresso.entrySet()
                .stream()
                .max((e1, e2) -> {
                    if (!e1.getValue().equals(e2.getValue())) {
                        return e1.getValue().compareTo(e2.getValue());
                    }
                    return e2.getKey().compareTo(e1.getKey());
                })
                .get()
                .getKey();
    }

    public static void main(String[] args) {
        String[] votes = {"B", "A", "B", "C", "A"};
        System.out.println("Vencedor: " + findWinner(votes));
    }
}