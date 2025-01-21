package Lecture7;

import java.util.ArrayList;
import java.util.Random;

public class Exercise11 {

    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            num.add(random.nextInt(100) + 1);
        }
        System.out.println("Number: " + num);
        int max = num.get(0);
        int min = num.get(0);
        for (int number : num) {
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
