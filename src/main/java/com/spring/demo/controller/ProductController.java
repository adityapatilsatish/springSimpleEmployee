package com.spring.demo.controller;

import com.spring.demo.entity.Product;
import com.spring.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product){

        return productService.saveProduct(product);
    }

    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products){

        return productService.saveProducts(products);
    }

    @GetMapping("/getProducts")
    public List<Product> findAllProducts(){

        return productService.getProducts();
    }

    @GetMapping("/getProductById/{id}")
    public Product findAllProduct(@PathVariable int id){

        return productService.getProductById(id);
    }

    @GetMapping("/getProductByName/{name}")
    public List<Product> findAllProduct(@PathVariable String name){

        return productService.getProductByName(name);
    }


    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product){

        return productService.updateProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public String updateProduct(@PathVariable int id){

        return productService.deleteProductById(id);
    }

}
