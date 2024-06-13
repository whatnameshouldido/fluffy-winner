package com.studymavernspringboot.study001.MathExam;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dataCount = input.nextInt();
        int displayCount = input.nextInt();

        Student[] students = new Student[dataCount];
        for(int i = 0; i < students.length; i++) {
            String name = input.next();
            int score = input.nextInt();

            students[i] = new Student();
            students[i].setName(name);
            students[i].setScore(score);
        }

//        Student[] sortedStudents= new Student[students.length];
//        int ndx = 0;
        for(int i = 0; i < students.length; i++) {
            for(int j = i; j < students.length; j++) {
                if (students[i].getScore() < students[j].getScore()) {
                    String tempName = students[i].getName();
                    int tempScore = students[i].getScore();

                    students[i].setName(students[j].getName());
                    students[i].setScore(students[j].getScore());

                    students[j].setName(tempName);
                    students[j].setScore(tempScore);
                }
            }
        }

        for (int i = 0; i < displayCount; i++) {
            System.out.println(students[i]);
        }
    }
}

