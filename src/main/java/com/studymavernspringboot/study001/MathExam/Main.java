package com.studymavernspringboot.study001.MathExam;

import java.util.Arrays;
import java.util.Scanner;

class Input_Score { // 점수 입력 클래스 생성
    String name; //이름 선언
    int score; //점수 선언

    Input_Score(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //입력할 인원 수
        int m = sc.nextInt(); //출력될 인원 수
        Input_Score[] arr = new Input_Score[n]; //입력되는 인원들의 값이 arr에 들어감

        for(int i=0; i<n; i++) { // 입력할 인원 수가 다 입력될 때까지 반복
            String name = sc.next(); //이름 입력
            int score = sc.nextInt(); //점수 입력
            arr[i] = new Input_Score(name, score); //객체 생성 및 배열에 저장
        }

        Arrays.sort(arr, (a, b) -> {
            if (b.score != a.score) { //b랑 a의 점수가 다를 때
                return b.score - a.score; //b - a를 해서 양수가 나오면 b>a 이므로 내림차순 적용이 됨
            }
            else { // 값이 음수가 나오면 a가 b보다 크므로 그대로 유지
                return 0;
            }
        });

        for (int i=0; i<m; i++) { //상위 m명 출력
            System.out.println(arr[i].name);
        }
    }
}
