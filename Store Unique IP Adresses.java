package Task-2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueIPAddresses {
    public static void main(String[] args) {

        List<String> ipAddresses = new ArrayList<>();

        ipAddresses.add("198.129.1.1");
        ipAddresses.add("18.2.9.4");
        ipAddresses.add("181.138.5.3");
        ipAddresses.add("178.12.3.2");
        ipAddresses.add("156.3.2.7");
        ipAddresses.add("155.162.2.3");
        ipAddresses.add("182.169.2.1");
        ipAddresses.add("161.14.6.2");
        ipAddresses.add("163.198.1.6");
        ipAddresses.add("171.128.3.5");

        System.out.println("Original IP List:");
        for (String ip : ipAddresses) {
            System.out.println(ip);
        }

        Set<String> uniqueIPs = new HashSet<>(ipAddresses);

        System.out.println("\nUnique IP Addresses (After Removing Duplicates):");
        for (String ip : uniqueIPs) {
            System.out.println(ip);
        }
    }
}