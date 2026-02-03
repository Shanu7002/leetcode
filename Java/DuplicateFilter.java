import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class DuplicateFilter {
    public static String[] uniqueNames(String[] names1, String[] names2) {
        Set<String> set = new HashSet<>(Arrays.asList(names1));

        set.addAll(Arrays.asList(names2));

        return set.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] names1 = {"Ava", "Emma", "Olivia"};
        String[] names2 = {"Olivia", "Sophia", "Emma"};

        // Deve imprimir Ava, Emma, Olivia, Sophia (em qualquer ordem)
        System.out.println(String.join(", ", uniqueNames(names1, names2)));
    }
}