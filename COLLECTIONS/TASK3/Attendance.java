package Task-3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AttendanceSystem {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> attendance = new LinkedHashMap<>();

        addStudent(attendance, 111, "farzaan");
        addStudent(attendance, 112, "maaz");
        addStudent(attendance, 113, "zaid");
        addStudent(attendance, 114, "shahid");
        addStudent(attendance, 115, "basid");

        addStudent(attendance, 112, "Duplicate");

        System.out.println("\n--- Attendance List (Order of Arrival) ---");
        for (Map.Entry<Integer, String> entry : attendance.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter roll number to search: ");
        int roll = sc.nextInt();

        if (attendance.containsKey(roll)) {
            System.out.println("Student Found: " + attendance.get(roll));
        } else {
            System.out.println(" not found!");
        }
    }
    static void addStudent(LinkedHashMap<Integer, String> map, int roll, String name) {
        if (map.containsKey(roll)) {
            System.out.println("Duplicate ignored: " + roll);
        } else {
            map.put(roll, name);
        }
    }
}
