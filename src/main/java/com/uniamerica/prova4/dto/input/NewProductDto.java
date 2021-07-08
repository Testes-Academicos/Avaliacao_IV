//package com.uniamerica.prova4.dto.input;
//
//import com.uniamerica.prova4.model.Category;
//import com.uniamerica.prova4.model.Product;
//import lombok.Data;
//
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.NotEmpty;
//import javax.validation.constraints.NotNull;
//
//@Data
//public class NewProductDto {
//    @NotBlank(message = "The name is mandatory.")
//    private String name;
//    @NotBlank(message = "The description is mandatory.")
//    private String description;
//    @NotEmpty
//    @NotNull
//    private double price;
//    @NotEmpty
//    @NotNull
//    private String validity;
//
//    @ManyToOne
//    @JoinColumn(name = "id_category")
//    @NotBlank(message = "The category is mandatory.")
//    private Category category;
//
//    public Product convertModel(){
//        Product product = new Product();
//
//}
