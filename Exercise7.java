package Lecture7;

import java.util.ArrayList;

public class Exercise7 {

    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(2);
        num.add(6);
        num.add(8);
        num.add(12);
        num.add(24);
        System.out.println("Initial: " + num);
        for (int i = 0; i < num.size() / 2; i++) {
            int temp = num.get(i);
            num.set(i, num.get(num.size() - 1 - i));
            num.set(num.size() - 1 - i, temp);
        }
        System.out.println("Reversed: " + num);
    }
}
