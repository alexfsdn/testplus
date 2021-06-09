package com.testplus.testplus.repository;

import com.testplus.testplus.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    Product findByNameIgnoreCase(String name);

    @Query("select p from Product p order by p.price asc")
    List<Product> findAllOrderedByPriceAsc();
}
