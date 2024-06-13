package com.studymavernspringboot.study001.MathExam;

//    13번

//    public class Member {
//        String name;
//        String id;
//        String password;
//        int age;
//    }


//    14번

//    public class Member {
//        String name;
//        String id;
//        String password;
//        int age;
//
//        public Member (String name, String id) {
//            this.name = name;
//            this.id = id;
//        }
//    }


//    15번

//public class MemberService {
//        boolean login(String id , String password) {
//            if(id.equals("hong") && password.equals("12345")) {
//                return true;
//            }
//            else {
//                return false;
//            }
//        }
//        void logout(String id) {
//            System.out.println(id + "님이 로그아웃 되었습니다.");
//        }
//    public static void main(String[] args) {
//        MemberService memberService = new MemberService();
//        boolean result = memberService.login("hong", "12345");
//        if (result) {
//            System.out.println("로그인 되었습니다.");
//            memberService.logout("hong");
//        } else {
//            System.out.println("id 또는 password가 올바르지 않습니다.");
//        }
//    }
//}

    16번

public class print {
        public static void main(String[] args) {
            Printer printer = new Printer();
            printer.println(10);
            printer.println(true);
            printer.println(5.7);
            printer.println("홍길동");
        }
}