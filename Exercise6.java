package Lecture7;

import java.util.ArrayList;
import java.util.Random;

public class Exercise6 {

    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        Random rd = new Random();
        for (int i = 0; i < 15; i++) {
            num.add(rd.nextInt(50) + 1);
        }
        System.out.println("Random number: " + num);
        int even = 0;
        int odd = 0;
        for (int n : num) {
            if (n % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
