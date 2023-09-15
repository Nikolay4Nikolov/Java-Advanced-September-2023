package AdvancedSeptember2023;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class SimpleCalculator_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        Deque<Integer> resultStack = new ArrayDeque<>();
        int sum = 0;

        for (int i = 0; i < input.length; i++) {
            if (resultStack.isEmpty()) {
                resultStack.push(Integer.valueOf(input[i]));
            } else {
                if (input[i].equals("+")) {
                    int lastNum = resultStack.peek();
                    int nextNum = Integer.parseInt(input[i+1]);
                    sum = lastNum + nextNum;
                    resultStack.push(sum);
                    i ++;
                } else if (input[i].equals("-")) {
                    int lastNum = resultStack.peek();
                    int nextNum = Integer.parseInt(input[i+1]);
                    sum = lastNum - nextNum;
                    resultStack.push(sum);
                    i ++;
                }
            }

        }
        System.out.println(resultStack.peek());
    }
}
