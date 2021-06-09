package com.testplus.testplus;

import com.testplus.testplus.model.Product;
import com.testplus.testplus.repository.ProductRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ProductTest {

    @Autowired
    private ProductRepository productRepository;

    @Test
    public void test() {
        //Arrange
        final int TAMANHO_ESPERADO = 2;

        //Action
        List<Product> productList = productRepository.findAll();
        int tamanhoDaLista = productList.size();


        //Assert
        Assertions.assertEquals(TAMANHO_ESPERADO, tamanhoDaLista);
    }
}
