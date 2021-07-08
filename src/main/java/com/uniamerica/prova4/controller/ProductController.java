package com.uniamerica.prova4.controller;


import com.uniamerica.prova4.model.Product;
import com.uniamerica.prova4.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping({"/products"})
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> findAll() {
        return productService.findAll();
    }
    @PostMapping
    public Product create(@Valid @RequestBody Product product){
        return productService.create(product);
    }
    @PutMapping("/{id}")
    public Product update(@PathVariable("id") Long id, @Valid @RequestBody Product product){
        return productService.update(id, product);
    }
//    @DeleteMapping("/{id}")
//    public String destroy(@PathVariable("id") Long id){
//        return productService.destroy(id);
//    }
//    @GetMapping("/{id}")
//    public Product find(@PathVariable("id") Product id) {
//        return productService.find(id);
//    }

}
