package org.kopiitem.web;

import org.kopiitem.domain.Category;
import org.kopiitem.domain.Product;
import org.kopiitem.repository.CategoryRepository;
import org.kopiitem.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by DonnyLies on 7/24/2016.
 */
@RestController
@RequestMapping(value = "/product")
public class ProductController {
    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @RequestMapping("/getProductByCategory")
    public List<Product> getProductByCategory(){
        return productRepository.findMeSomething("Potato");


    }

}
