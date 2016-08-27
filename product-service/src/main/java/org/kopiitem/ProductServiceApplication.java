package org.kopiitem;

import org.kopiitem.domain.Category;
import org.kopiitem.domain.Product;
import org.kopiitem.repository.CategoryRepository;
import org.kopiitem.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.stream.Stream;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ProductServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductServiceApplication.class, args);
    }
}

@Component
class SampleOfCategory implements CommandLineRunner {

    private CategoryRepository categoryRepository;

    @Autowired
    public void setCategoryRepository(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        Stream.of("Fish", "Fruit", "Vegetable").forEach(s -> {
            Category category = new Category();
            category.setName(s);
            category.setTag("food");

            categoryRepository.save(category);

        });
    }
}

@Component
class SampleOfProduct implements CommandLineRunner {

    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    private CategoryRepository categoryRepository;

    @Autowired
    public void setCategoryRepository(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void run(String... strings) throws Exception {

        Stream.of("Milk Fish", "Salmon", "Sword Fish").forEach(s -> {
            Product product = new Product();
            product.setDescription("");
            product.setImage("");
            product.setName(s);
            product.setPrice(new BigDecimal(Math.random()));
            product.setCategory(categoryRepository.findOne(1l));

            productRepository.save(product);

        });

        Stream.of("Banana", "Pinaple", "Kiwi", "Melon", "Strawberry").forEach(s -> {
            Product product = new Product();
            product.setDescription("");
            product.setImage("");
            product.setName(s);
            product.setPrice(new BigDecimal(Math.random()));
            product.setCategory(categoryRepository.findOne(2l));

            productRepository.save(product);

        });

        Stream.of("Spinach", "Letus", "Cabbage", "Carrot", "Potato").forEach(s -> {
            Product product = new Product();
            product.setDescription("");
            product.setImage("");
            product.setName(s);
            product.setPrice(new BigDecimal(Math.random()));
            product.setCategory(categoryRepository.findOne(3l));

            productRepository.save(product);

        });
    }
}


