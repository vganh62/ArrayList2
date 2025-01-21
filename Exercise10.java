package Lecture7;

import java.util.ArrayList;

public class Exercise10 {

    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("Han");
        name.add("Loan");
        name.add("Diep");
        name.add("Duong");
        name.add("Han");
        name.add("Diep");

        System.out.println("Initial: " + name);

        ArrayList<String> unique = new ArrayList<>();

        for (String n : name) {
            if (!unique.contains(n)) {
                unique.add(n);
            }
        }
        System.out.println("List: " + unique);
    }
}
