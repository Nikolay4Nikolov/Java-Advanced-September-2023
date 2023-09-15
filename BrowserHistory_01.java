package AdvancedSeptember2023;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BrowserHistory_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Deque<String> urlStack = new ArrayDeque<>();

        while (!input.equals("Home")) {
            if (input.equals("back")) {
                if (input.isEmpty()) {
                    System.out.println("no previous URLs");
                    input = scanner.nextLine();
                    continue;
                } else {
                    if (urlStack.size() <= 1) {
                        System.out.println("no previous URLs");
                    } else {
                        urlStack.pop();
                        System.out.println(urlStack.peek());
                    }
                }
            } else {
                urlStack.push(input);
                System.out.println(urlStack.peek());
            }


            input = scanner.nextLine();
        }

    }
}
