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
@Table(name="raw_items")
public class RawItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="category_id")
    private int categoryId;
    @Column(name="mrp")
    private int mrp;
    @Column(name="purchased_from")
    private int purchasedFrom;
    @Column(name="created_at")
    private LocalDate createdAt;
    @Column(name="updated_at")
    private LocalDate updatedAt;


    public RawItems(String name, int categoryId, int mrp, int purchasedFrom) {
        this.name = name;
        this.categoryId = categoryId;
        this.mrp = mrp;
        this.purchasedFrom = purchasedFrom;
    }
}
