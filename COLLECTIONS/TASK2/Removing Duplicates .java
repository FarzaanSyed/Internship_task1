package Task-2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Farzaan");
        names.add("Maaz");
        names.add("Basid");
        names.add("Hajra");
        names.add("Zaid");
        names.add("Shahid");
        names.add("Farzaan");

        System.out.println(names);

        Set<String> uniqueNames = new HashSet<>(names);
        System.out.println(uniqueNames);

        List<String> uniqueList = new ArrayList<>(uniqueNames);
        System.out.println(uniqueList);

    }
}
