package com.spring.demo.service;

import com.spring.demo.entity.Product;
import com.spring.demo.repository.ProductInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductInterface ProductRepo;

    public Product saveProduct(Product product){
        Product save = ProductRepo.save(product);
        return save;
    }

    public void saveAllProducts(List<Product> productList){

        ProductRepo.saveAll(productList);
//        for (Product product : productList) {
//            ProductRepo.save(product);
//        }

    }

    public List<Product> getProducts(){
        return ProductRepo.findAll();
    }

    public Product getProductById(int Id){
        return ProductRepo.findById(Id).orElse(null);
    }

    public List<Product> getProductByName(String name){
        return ProductRepo.findByName(name);
    }

    public String deleteProductById(int id){
        ProductRepo.deleteById(id);
        return "Product deleted" + id;
    }

    public Product updateProduct(Product product){
        Product excestingProduct = ProductRepo.findById(product.getId()).orElse(null);

        if (excestingProduct == null){
            System.out.println("Invalid Input");
            return null;
        }

        excestingProduct.setName(product.getName());
        excestingProduct.setPrise(product.getPrise());
        excestingProduct.setQuantity(product.getQuantity());

        return ProductRepo.save(excestingProduct);

    }

    public List<Product> saveProducts(List<Product> products){

        return ProductRepo.saveAll(products);
    }
}
