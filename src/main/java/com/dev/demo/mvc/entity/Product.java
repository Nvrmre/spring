package com.dev.demo.mvc.entity;

public class Product {
   private Long id;
   private Long code;
   private String name;
   private String merk;
   

    public Product() {
    }

    public Product(Long id, Long code, String name, String merk) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.merk = merk;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCode() {
        return this.code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMerk() {
        return this.merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }


}
