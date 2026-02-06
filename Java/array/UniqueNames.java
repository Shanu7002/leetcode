package array;

import java.util.HashSet;
import java.util.Arrays;

public class UniqueNames {

    public static String[] uniqueNames(String[] names1, String[] names2) {
        // fast return and checks
        if (names1 == null) names1 = new String[0];
        if (names2 == null) names2 = new String[0];
        if (names1.length == 0 && names2.length == 0) {
            return new String[0];
        }

        // create a Set with all names1
        HashSet<String> namesFinal = new HashSet<>(Arrays.asList(names1));
        // add names2 to set
        namesFinal.addAll(Arrays.asList(names2));
        // return the set as an Array
        return namesFinal.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] names1 = {"Ava", "Emma", "Olivia"};
        String[] names2 = {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", uniqueNames(names1, names2)));
    }
}