package com.studymavernspringboot.study001.MathExam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String[] date = str.split("\\.");
        String year = date[0];
        String month = date[1];
        String day = date[2];

        int month1 = Integer.parseInt(month);
        int day1 = Integer.parseInt(day);

        System.out.println(year + "." + (String.format("%02d", month1)) + "." + (String.format("%02d", day1)));

        scanner.close();
    }
}