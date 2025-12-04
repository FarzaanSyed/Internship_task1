package Task-3;

import java.util.Map;
import java.util.TreeMap;

public class EmployeeDirectory {
    public static void main(String[] args) {

        TreeMap<Integer, String> employees = new TreeMap<>();

        employees.put(001, "farzaan");
        employees.put(002, "zaid");
        employees.put(003, "maaz");
        employees.put(004, "shahid");
        employees.put(005, "basid");

        System.out.println("--- Sorted Directory ---");
        for (Map.Entry<Integer, String> entry : employees.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
