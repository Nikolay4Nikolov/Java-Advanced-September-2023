package AdvancedSeptember2023;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class MatchingBrackets_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Deque<Integer> result = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);

            if (symbol == '(') {
                result.push(i);
            } else if (symbol == ')') {
                result.push(i);
                int closedBracket = result.peek();
                result.pop();
                int openBracket = result.peek();
                result.pop();
                String subString = input.substring(openBracket, closedBracket + 1);
                System.out.println(subString);
            }
        }


    }
}
