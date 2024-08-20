package com.example.bankingservice.service;

public class BalanceUserService {

    public static double checkBalance(double balanceUser) {
        if(balanceUser >= 0){
            return balanceUser;
        }else{
            throw new IllegalArgumentException("Error balance user less than zero");
        }
    }
}
