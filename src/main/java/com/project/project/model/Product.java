package com.project.project.model;

import com.project.project.model.enums.ProductForGender;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String productName;
    private String description;
    private double price;
    @ManyToOne
    private Category category;

    @ManyToMany
    private List<Order> order;

    private int count;
    private ProductForGender productForGender;
}
