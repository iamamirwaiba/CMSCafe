package com.personal.cafecms.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="menu")
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="category_id")
    private int categoryId;
    @Column(name="name")
    private String name;
    @Column(name="price")
    private int price;
    @Column(name="created_at")
    private LocalDate createdAt;
    @Column(name="updated_at")
    private LocalDate updatedAt;

    public Menu(int categoryId, String name, int price) {
        this.categoryId = categoryId;
        this.name = name;
        this.price = price;
    }
}
