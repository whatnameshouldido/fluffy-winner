//package com.studymavernspringboot.study001.MathExam.Book.Ch06;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class AccountService {
//    private List<AccountByTeacher> accountList = new ArrayList<>();
//
//    public int size() {
//        return this.accountList.size();
//    }
//
//    public void clear() {
//        this.accountList.clear();
//    }
//
//    public boolean addAccount(String name, String bankAccount, int money) {
//        return this.accountList.add(new AccountByTeacher(name, bankAccount, money));
//    }
//
//    public boolean addAccount(AccountByTeacher account) {
//        return this.accountList.add(account);
//    }
//
//    public List<AccountByTeacher> getAllAccount() {
//        return this.accountList;
//    }
//
//    public boolean deposit(String bankAccount, int money) {
//        AccountByTeacher account = this.findAccountByNumber(bankAccount);
//        if ( account == null ) {
//            return false;
//        }
//        account.setCurrent(account.getCurrent() + money);
//        return true;
//    }
//
//    public boolean withdraw(String bankAccount, int money) {
//        AccountByTeacher account = this.findAccountByNumber(bankAccount);
//        if ( account == null ) {
//            return false;
//        }
//        if ( account.getCurrent() >= money ) {
//            account.setCurrent(account.getCurrent() - money);
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public AccountByTeacher findAccountByNumber( String bankAccount ) {
//        if ( bankAccount == null || bankAccount.isEmpty() ) {
//            return null;
//        }
//        for ( AccountByTeacher account : accountList ) {
//            if ( bankAccount.equals(account.getBankNumber()) ) {
//                return account;
//            }
//        }
//        return null;
//    }
//}