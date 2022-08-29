package com.personal.cafecms.Entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="daily_sales")
public class DailySales {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="opening_balance")
    private int openingBalance;
    @Column(name="closing_balance")
    private int closingBalance;
    @Column(name="expenses")
    private int expenses;
    @Column(name="dues")
    private int dues;
    @Column(name="payment_means")
    private String paymentMeans;
    @Column(name="customer_count")
    private int customerCount;

    public DailySales(int openingBalance, int closingBalance, int expenses, int dues, String paymentMeans, int customerCount) {
        this.openingBalance = openingBalance;
        this.closingBalance = closingBalance;
        this.expenses = expenses;
        this.dues = dues;
        this.paymentMeans = paymentMeans;
        this.customerCount = customerCount;
    }
}
