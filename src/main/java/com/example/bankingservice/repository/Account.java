package com.example.bankingservice.repository;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "account")
@Getter
@Setter
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="account_id")
    private Long accountId;

    @Column(name="balance")
    private double balanceUser;

    @Column(name="initial_sum")
    private double initialSum;// начальная сумма

    @Column(name="id_user")
    private Long idUser;

}
