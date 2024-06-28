package com.example.bankingservice.repository;

import jakarta.persistence.*;

@Entity
@Table(name = "accounts")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Double balance;

    @Column(nullable = false)
    private Double initialBalance; // начальная сумма

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id") //Указывает, что данное поле является внешним ключом, ссылающимся на поле id другой таблицы.
    private User user;
}
