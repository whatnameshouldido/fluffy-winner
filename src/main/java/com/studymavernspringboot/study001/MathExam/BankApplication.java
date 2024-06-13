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

//    16번

//public class Printer {
//        void println(int x) {
//            System.out.println(x);
//        }
//        void println(boolean x) {
//            System.out.println(x);
//        }
//        void println(double x) {
//            System.out.println(x);
//        }
//        void println(String x) {
//            System.out.println(x);
//        }
//        public static void main(String[] args) {
//            Printer printer = new Printer();
//            printer.println(10);
//            printer.println(true);
//            printer.println(5.7);
//            printer.println("홍길동");
//        }
//}

//    17번

//public class Printer {
//        static void println(int x) {
//            System.out.println(x);
//        }
//        static void println(boolean x) {
//            System.out.println(x);
//        }
//        static void println(double x) {
//            System.out.println(x);
//        }
//        static void println(String x) {
//            System.out.println(x);
//        }
//        public static void main(String[] args) {
//            Printer.println(10);
//            Printer.println(true);
//            Printer.println(5.7);
//            Printer.println("홍길동");
//        }
//}

//    18번

//public class ShopService {
//    private static ShopService shopservice = new ShopService();
//
//    private ShopService() {
//    }
//
//    public static ShopService getInstance() {
//        return shopservice;
//    }
//    public static void main(String[] args) {
//        ShopService obj1 = ShopService.getInstance();
//        ShopService obj2 = ShopService.getInstance();
//
//        if (obj1 == obj2) {
//            System.out.println("같은 ShopService 객체입니다.");
//        } else {
//            System.out.println("다른 ShopService 객체입니다.");
//        }
//    }
//}

//    19번

//public class Account {
//    static final int MIN_BALANCE = 0;
//    static final int MAX_BALANCE = 1000000;
//
//    private int balance;
//
//    public int getBalance() {
//        return balance;
//    }
//
//    public void setBalance(int balance) {
//        if(balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
//            this.balance = balance;
//        }
//    }
//    public static void main(String[] args) {
//        Account account = new Account();
//
//        account.setBalance(10000);
//        System.out.println("현재 잔고: " + account.getBalance());
//
//        account.setBalance(-100);
//        System.out.println("현재 잔고: " + account.getBalance());
//
//        account.setBalance(2000000);
//        System.out.println("현재 잔고: " + account.getBalance());
//
//        account.setBalance(300000);
//        System.out.println("현재 잔고: " + account.getBalance());
//    }
//}

//    20번

import java.util.Scanner;

public class BankApplication {
    static Account[] accountarray = new Account[100];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while(true) {
            System.out.println("----------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("----------------------------------------------");
            System.out.print("선택> ");
            int num = scanner.nextInt();

            if (num == 1) {
                createAccount();
            }
            else if (num == 2) {
                accountlist();
            }
            else if (num == 3) {
                moneyin();
            }
            else if (num == 4) {
                moneyout();
            }
            else if (num == 5) {
                System.out.println("프로그램 종료");
                break;
            }
        }

    }

    private static void createAccount() {
        System.out.println("--------------");
        System.out.println("계좌생성");
        System.out.println("--------------");

        System.out.print("계좌번호: ");
        String acnum = scanner.next();
        System.out.print("계좌주: ");
        String owner = scanner.next();
        System.out.print("초기입금액: ");
        int money = scanner.nextInt();

        Account account = new Account(acnum, owner, money);

        for(int i=0; i<accountarray.length; i++) {
            if(accountarray[i] == null) {
                accountarray[i] = account;
                System.out.println("결과: 계좌가 생성되었습니다.");
                break;
            }
        }
    }

    private static Account chooseAccount(String acnum) {
        Account account = null;
        for(int i=0; i<accountarray.length; i++) {
            if (accountarray[i] != null) {
                if(accountarray[i].getAcnum().equals(acnum)) {
                    account = accountarray[i];
                    break;
                }
            }
        }
        return account;
    }


    private static void accountlist() {
        System.out.println("--------------");
        System.out.println("계좌목록");
        System.out.println("--------------");

        for(int i=0; i<accountarray.length; i++) {
            if (accountarray[i] == null) {
                break;
            }
            else {
                System.out.println(accountarray[i].getAcnum() + "  " + accountarray[i].getOwner() + "   " + accountarray[i].getMoney());
            }
        }
    }

    private static void moneyin() {
        System.out.println("--------------");
        System.out.println("예금");
        System.out.println("--------------");

        System.out.print("계좌번호: ");
        String acnum = scanner.next();
        System.out.print("예금액: ");
        int money = scanner.nextInt();

        Account account = chooseAccount(acnum);

        account.setMoney(account.getMoney() + money);
        System.out.println("결과: 예금이 성공되었습니다.");
    }

    private static void moneyout() {
        System.out.println("--------------");
        System.out.println("출금");
        System.out.println("--------------");

        System.out.print("계좌번호: ");
        String acnum = scanner.next();
        System.out.print("출금액: ");
        int money = scanner.nextInt();

        Account account = chooseAccount(acnum);

        account.setMoney(account.getMoney() - money);
        System.out.println("결과: 출금이 성공되었습니다.");
    }
}