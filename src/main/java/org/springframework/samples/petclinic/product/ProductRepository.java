package org.springframework.samples.petclinic.product;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;



public interface ProductRepository extends CrudRepository<Product,Integer>{
    List<Product> findAll();
    @Query("SELECT prodType FROM ProductType prodType")
    List<ProductType> findAllProductTypes();
    Optional<Product> findById(int id);
    @Query("SELECT prodType from ProductType prodType where prodType.name=?1")
    ProductType findByNameProductType(String name);
    @Query("SELECT product FROM Product product where product.price<=?1")
    List<Product> findByPriceLessThan(Double cost);
    Product findByName(String name);
    Product save(Product p);
}
