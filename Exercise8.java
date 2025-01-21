package Lecture7;

import java.util.ArrayList;

public class Exercise8 {

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Cam");
        fruits.add("Quyt");
        fruits.add("Dua hau");
        fruits.add("Tao");
        System.out.println("Initial: " + fruits);
        ArrayList<String> cop = new ArrayList<>();
        for (String f : fruits) {
            cop.add(f);
        }
        System.out.println("Copied: " + cop);
    }
}
