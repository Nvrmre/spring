package com.dev.demo.mvc.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.dev.demo.mvc.service.ProductService;

@Controller
@RequestMapping("")

public class HomeController {


    @Autowired
    private ProductService productService;
    @GetMapping

    // parameter Model sebagai container
    public String wellcome(Model model) {

        // membuat variabel message
        String messege = "Halo saya Spring";

        // memasukan variabel message ke dalam parameter model
        model.addAttribute("msg", messege);
        model.addAttribute("products", productService.findAll());
        // mereturn file index.html di folder template
        return "index";
    }
}
