package com.uniamerica.prova4.service;

import com.uniamerica.prova4.model.Product;
import com.uniamerica.prova4.repository.ProductRepositoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepositoy productRepositoy;
    public List<Product> findAll() {
        return productRepositoy.findAll();
    }

    public Product create(Product product) {
        return productRepositoy.save(product);

    }

    public Product update(Long id, Product product) {
        return productRepositoy.findById(id).orElseThrow(
                () -> new IllegalStateException("company does not exist. id: " + id)
        );
    }


}
