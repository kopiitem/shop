package org.kopiitem.repository;

import org.kopiitem.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import java.util.Collection;
import java.util.List;

/**
 * Created by DonnyLies on 7/24/2016.
 */
@RepositoryRestController
public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query(value = "SELECT p.* FROM Product p LEFT OUTER JOIN Category c ON p.category_id = c.id WHERE p.name = :name", nativeQuery = true)
    List<Product> findMeSomething(@Param("name") String name);
    @RestResource(path = "by-name")
    Collection<Product> findByNameContaining(@Param("name") String name);

}

