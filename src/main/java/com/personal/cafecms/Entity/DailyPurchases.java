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
@Table(name="daily_purchases")
public class DailyPurchases {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="item_id")
    private int itemId;
    @Column(name="item_category")
    private int itemCategory;
    @Column(name="qty")
    private int qty;
    @Column(name="price")
    private int price;
    @Column(name="paid_means_id")
    private int paidMeansId;
    @Column(name="created_at")
    private LocalDate createdAt;
    @Column(name="updated_at")
    private LocalDate updatedAt;

    public DailyPurchases(int itemId, int itemCategory, int qty, int price, int paidMeansId) {
        this.itemId = itemId;
        this.itemCategory = itemCategory;
        this.qty = qty;
        this.price = price;
        this.paidMeansId = paidMeansId;
    }
}
