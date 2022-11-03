package org.springframework.samples.petclinic.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;
   
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public List<Product> getProductsCheaperThan(double price) {
        return productRepository.findByPriceLessThan(price);
    }

    public ProductType getProductType(String typeName) {
        return productRepository.findByNameProductType(typeName);
    }

    public Product save(Product p){
        return null;       
    }

    public ProductType findByNameProductType(String name){
        return productRepository.findByNameProductType(name);
    }

    public List<ProductType> findAllProductTypes(){
        return productRepository.findAllProductTypes();
    }
    
}