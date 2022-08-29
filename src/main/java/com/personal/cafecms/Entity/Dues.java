package com.personal.cafecms.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="dues")
public class Dues {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;
    @Column(name="amount")
    private int amount;
    @Column(name="paid_amount")
    private int paidAmount;
    @Column(name="contact_number")
    private String contactNumber;
    @Column(name="paid_date")
    private LocalDate paidDate;
    @Column(name="created_at")
    private LocalDate createdAt;
    @Column(name="updated_at")
    private LocalDate updatedAt;

    public Dues(String name, int amount, int paidAmount, String contactNumber) {
        this.name = name;
        this.amount = amount;
        this.paidAmount = paidAmount;
        this.contactNumber = contactNumber;
    }
}
