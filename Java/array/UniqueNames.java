package array;

import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class UniqueNames {

    public static String[] uniqueNames(String[] names1, String[] names2) {
        // TODO: Implemente a lógica usando HashSet para O(n + m)
        return null;
    }

    public static void main(String[] args) {
        String[] names1 = {"Ava", "Emma", "Olivia"};
        String[] names2 = {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", uniqueNames(names1, names2)));
        // Esperado: Ava, Emma, Olivia, Sophia (em qualquer ordem)
    }
}