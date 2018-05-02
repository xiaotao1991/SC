package com.xiaotao.consumer.fegin.entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by 13725 on 2018/4/28.
 */
public class User implements Serializable {

    private Long id;

    private String username;

    private int age;

    private BigDecimal balance;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
