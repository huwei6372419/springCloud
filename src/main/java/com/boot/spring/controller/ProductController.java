package com.boot.spring.controller;

import com.boot.spring.po.ProductInfo;
import com.boot.spring.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ProductController {

    @Autowired
    ProductInfoService productInfoService;


    @GetMapping("test")
    public String get(){
        productInfoService.insert(new ProductInfo());
        return "1";
    }


}
