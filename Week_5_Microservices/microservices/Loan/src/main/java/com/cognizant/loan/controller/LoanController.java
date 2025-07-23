package com.cognizant.loan.controller;

import com.cognizant.loan.model.Loan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loans")
public class LoanController {

    @GetMapping("/{number}")
    public Loan getLoan(@PathVariable String number){
        Loan ln = new Loan();
        ln.setNumber(number);
        ln.setType("car");
        ln.setLoan(400000);
        ln.setEmi(3258);
        ln.setTenure(18);
        return ln;
    }
}
