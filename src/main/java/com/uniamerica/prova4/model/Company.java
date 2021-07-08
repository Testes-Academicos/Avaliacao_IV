package com.uniamerica.prova4.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Company {

    @Id
    private Long id;
    private  String name;
    private String cnpj;

    @JsonManagedReference
    @OneToMany(mappedBy="company")
    private List<Product> products = new ArrayList<>();

    // observar
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
