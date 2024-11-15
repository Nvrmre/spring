package com.dev.demo.mvc.service;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.dev.demo.mvc.entity.Product;

@Service
public class ProductService {

    private static List<Product> products = Arrays.asList(
            new Product(1L, 200192L, "Sansel", "SUNSILK"),
            new Product(2L, 2000392L, "Sumns", "loksoi"),
            new Product(3L, 282122L, "kols", "kokoi"),
            new Product(4L, 9023834L, "wokwo", "kokoi"),
            new Product(5L, 9078879L, "kowka", "kokoi")

    );

    public List<Product> findAll() {
        return products;
    }
}
