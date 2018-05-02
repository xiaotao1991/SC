package com.xiaotao.test.XServcer1.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by 13725 on 2018/4/28.
 */
@Entity
@Table(name = "user")
public class User implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String username;
    @Column
    private int age;
    @Column
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
