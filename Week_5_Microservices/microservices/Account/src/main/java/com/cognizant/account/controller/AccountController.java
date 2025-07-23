package com.cognizant.account.controller;

import com.cognizant.account.Model.Account;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {

    @GetMapping("/{number}")
    public Account getAccount(@PathVariable("number") String number){
        Account acc = new Account();
        acc.setNumber(number);
        acc.setBalance(234343);
        acc.setType("savings");

        return acc;
    }
}
