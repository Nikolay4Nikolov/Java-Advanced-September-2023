package AdvancedSeptember2023;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class DecimalToBinary_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        Deque<Integer> stack = new ArrayDeque<>();

        if (number == 0) {
            System.out.print(0);
        } else {
            while (number != 0) {
                stack.push(number % 2);
                number = number / 2;
            }


            for (Integer numbers : stack) {
                System.out.print(numbers);
            }
        }
    }
}
