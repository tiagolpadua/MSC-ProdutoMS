package com.example.ProdutoMS;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OlaController {

    @RequestMapping("/")
    public String index() {
        return "Olá do Spring Boot!";
    }

}