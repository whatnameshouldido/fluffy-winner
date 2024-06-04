package com.studymavernspringboot.study001.MathExam;

public class MathExam {
    public int subTest001(int n1, int n2) throws Exception {
        if (n1 < -50000 || n1 > 50000) {
            throw new Exception("num1 값은 -50000보다 작거나, num1 값은 50000보다 큽니다.");
        }
        if (n2 < -50000 || n2 > 50000) {
            throw new RuntimeException("num2 값은 -50000보다 작거나, num2 값은 50000보다 큽니다.");
        }
        return n1 - n2;
    }

    public int mathTest002(int n1, int n2) throws Exception {
        if (n1 < 0 || n1 > 100) {
            throw new Exception("num1 값은 0 ~ 100 사이의 값이어야 합니다.");
        }
        if (n2 < 0 || n2 > 100) {
            throw new Exception("num2 값은 0 ~ 100 사이의 값이어야 합니다.");
        }
        return n1 * n2;
    }

    public int mathTest004(int n1, int n2) throws Exception {
        if (n1 < 0 || n1 > 10000) {
            throw new Exception("num1 값은 0 ~ 10000 사이의 값이어야 합니다.");
        }
        if (n2 < 0 || n2 > 10000) {
            throw new Exception("num2 값은 0 ~ 10000 사이의 값이어야 합니다.");
        }
        if (n1 == n2)
            return 1;
        else
            return -1;
    }

    public int exam120585(int[] array, int height) throws Exception {
        int result = 0;

        if (array == null || array.length <= 0 || array.length > 100) {
            throw new Exception(String.format("array는 null 이 아니고, 길이가 1~100 이어야 합니다."));
        }
        if (height <= 0 || height > 200) {
            throw new Exception(String.format("height [%d] 는 1~200 이어야 합니다.", height));
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= 0 || array[i] > 200) {
                throw new Exception(String.format("array[%d] = [%d]는 1~200 이어야 합니다.", i, array[i]));
            }
            if (array[i] > height) {
                // 키 큰 사람을 누적해야 한다.
                result++;
            }
        }

        return result;
    }

    public int exam120818(int price) throws Exception {

        if (price < 10 || price > 1000000) {
            throw new Exception("price 값은 10 이상, 1000000 이하여야 합니다.");
        }

        if (price % 10 != 0) {
            throw new Exception("price 값은 10원 단위로 1의 자리가 0이어야 합니다.");
        }

        if (price >= 500000) {
            return price * 80 / 100;
        } else if (price >= 300000) {
            return price * 90 / 100;
        } else if (price >= 100000) {
            return price * 95 / 100;
        } else {
            return price;
        }
    }


    public int exam120837(double hp) throws Exception {
        if (hp%1>0) {
            throw new Exception("hp는 자연수입니다.");
        }
        if (hp<0||hp>1000) {
            throw new Exception("hp는 0~1000 입니다.");
        }
        int health = (int)hp;
        int result = health/5;
        result += (health%5)/3;
        result += (health%5)%3;
        return result;
    }

    public String exam120839(String rsp) throws Exception {
        if (rsp == null) {
            throw new Exception(String.format("rsp는 null이 아니어야 합니다."));
        }
        if (rsp.length() <= 0 || rsp.length() > 100) {
            throw new Exception(String.format("rsp[%s] 문자열의 길이는 1~100글자여야 합니다.", rsp));
        }
        String result = "";
        for (int i = 0; i < rsp.length(); i++) {
            char ch = rsp.charAt(i);
            if (ch == '2') {
                result += "0";
            } else if (ch == '0') {
                result += "5";
            } else if (ch == '5') {
                result += "2";
            } else {
                throw new Exception(String.format("rsp[%c] 문자는 '2', '0', '5' 중에 하나여야 합니다."));
            }
        }
        return result;
    }
}