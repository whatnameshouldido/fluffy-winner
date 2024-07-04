package com.studymavernspringboot.study001.MathExam;

import java.util.Scanner;
import java.util.HashMap;

public class Main {
    private static HashMap<Integer, Integer> memo = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        System.out.println(fibonacci(N));
    }

    private static int fibonacci(int n) {
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        int result = (fibonacci(n - 1) + fibonacci(n - 2)) % 10009;
        memo.put(n, result);
        return result;
    }
}
