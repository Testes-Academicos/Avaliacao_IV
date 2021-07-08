package com.uniamerica.prova4.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;

import lombok.NoArgsConstructor;

import javax.persistence.*;



@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Product extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;

    @NotNull
    private double price;
    private String validity;

    @ManyToOne
    @JoinColumn(name = "id_category")
    private Category category;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "id_company", nullable = false)
    private Company company;
}
