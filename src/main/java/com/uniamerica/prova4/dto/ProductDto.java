package com.uniamerica.prova4.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;


@Data
public class ProductDto {
    @JsonProperty("id")
    private Long id;
    private String name;
    private String description;
    private double price;
    private String validity;
}
