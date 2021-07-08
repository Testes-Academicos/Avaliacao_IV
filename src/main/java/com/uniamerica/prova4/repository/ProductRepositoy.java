package com.uniamerica.prova4.repository;

import com.uniamerica.prova4.model.Company;
import com.uniamerica.prova4.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepositoy  extends JpaRepository<Product, Long> {
    List<Product> findByCompany(Company company);
}
