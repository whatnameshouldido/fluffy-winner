package com.studymavernspringboot.study001.MathExam;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Account {
    private String acnum;
    private String owner;
    private int money;

    public Account(String acnum, String owner, int money) {
        this.acnum = acnum;
        this.owner = owner;
        this.money = money;
    }

}