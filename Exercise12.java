package Lecture7;

import java.util.ArrayList;
import java.util.Random;

public class Exercise12 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(100) + 1);
        }
        System.out.println("Random: " + numbers);
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum: " + sum);
    }
}
