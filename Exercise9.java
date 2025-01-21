package Lecture7;

import java.util.ArrayList;

public class Exercise9 {

    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        System.out.println("Numbers: " + num);
        int max = num.get(0);
        int min = num.get(0);
        for (Integer number : num) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
