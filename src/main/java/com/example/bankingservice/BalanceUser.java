package com.example.bankingservice;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class BalanceUser {

    private double balanceUser;
    private double initialSum;

}
