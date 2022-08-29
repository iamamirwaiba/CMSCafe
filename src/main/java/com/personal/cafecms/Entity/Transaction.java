package com.personal.cafecms.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="menu_item_id")
    private int menuItemId;
    @Column(name="menu_item_qty")
    private int menuItemQty;
    @Column(name="sale_amount")
    private int saleAmount;
    @Column(name="table_number")
    private int tableNumber;
    @Column(name="paid_means_id")
    private int paidMeansId;
    @Column(name="created_at")
    private LocalDate createdAt;
    @Column(name="updated_at")
    private LocalDate updatedAt;

    public Transaction(int menuItemId, int menuItemQty, int saleAmount, int tableNumber, int paidMeansId) {
        this.menuItemId = menuItemId;
        this.menuItemQty = menuItemQty;
        this.saleAmount = saleAmount;
        this.tableNumber = tableNumber;
        this.paidMeansId = paidMeansId;
    }
}
