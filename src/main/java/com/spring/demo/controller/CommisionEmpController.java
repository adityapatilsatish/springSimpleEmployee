package com.spring.demo.controller;

import com.spring.demo.entity.CommisionEmp;
import com.spring.demo.entity.Product;
import com.spring.demo.service.ProductService;
import com.spring.demo.service.commisionEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommisionEmpController {

    @Autowired
    commisionEmpService CommisionEmpService;

    @PostMapping("/addCommisionEmp")
    public CommisionEmp addProduct(@RequestBody CommisionEmp commEmp){

        return CommisionEmpService.addCommisionEmp(commEmp);
    }
//
//    @PostMapping("/addProducts")
//    public List<Product> addProducts(@RequestBody List<Product> products){
//
//        return productService.saveProducts(products);
//    }
//
//    @GetMapping("/getProductByName/{name}")
//    public List<Product> findAllProduct(@PathVariable String name){
//
//        return productService.getProductByName(name);
//    }
//
//
//    @PutMapping("/update")
//    public Product updateProduct(@RequestBody Product product){
//
//        return productService.updateProduct(product);
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public String updateProduct(@PathVariable int id){
//
//        return productService.deleteProductById(id);
//    }

}
