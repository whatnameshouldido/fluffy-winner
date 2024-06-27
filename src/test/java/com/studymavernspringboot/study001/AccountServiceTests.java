package com.studymavernspringboot.study001;

import com.studymavernspringboot.study001.MathExam.Book.Ch06.AccountByTeacher;
import com.studymavernspringboot.study001.MathExam.Book.Ch06.AccountService;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AccountServiceTests {
    @Test
    public void addAccountTest() {
        AccountService accountService = new AccountService();

        accountService.clear();
        accountService.addAccount("홍길동", "111-111", 20000);

        assertThat(accountService.size()).isEqualTo(1);

        AccountByTeacher find = accountService.findAccountByNumber("111-111");
        assertThat(find).isNotNull();
        assertThat(find.getName()).isEqualTo("홍길동");
        assertThat(find.getCurrent()).isEqualTo(20000);
    }

    @Test
    public void depositTest() {
        AccountService accountService = new AccountService();
        accountService.addAccount("홍길동", "111-111", 20000);
        accountService.addAccount("이순신", "222-222", 30000);
        assertThat(accountService.size()).isEqualTo(2);

        boolean result = accountService.deposit("222-222", 10000);
        assertThat(result).isEqualTo(true);

        AccountByTeacher find = accountService.findAccountByNumber("222-222");
        assertThat(find).isNotNull();
        assertThat(find.getCurrent()).isEqualTo(40000);

        AccountByTeacher find2 = accountService.findAccountByNumber("444-444");
        assertThat(find2).isNull();
    }

    @Test
    public void withdrawTest() {
        AccountService accountService = new AccountService();
        accountService.addAccount("홍길동", "333-333", 40000);
        assertThat(accountService.size()).isEqualTo(1);

        boolean result = accountService.withdraw("333-333", 20000);
        assertThat(result).isEqualTo(true);

        AccountByTeacher find = accountService.findAccountByNumber("333-333");
        assertThat(find).isNotNull();
        assertThat(find.getCurrent()).isEqualTo(20000);

        AccountByTeacher find2 = accountService.findAccountByNumber("555-555");
        assertThat(find2).isNull();

        boolean result2 = accountService.withdraw("333-333", 30000);
        assertThat(result2).isEqualTo(false);

        AccountByTeacher find3 = accountService.findAccountByNumber("333-333");
        assertThat(find3).isNotNull();
        assertThat(find3.getCurrent()).isEqualTo(20000);
    }
}