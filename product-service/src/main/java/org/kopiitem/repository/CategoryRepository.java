package org.kopiitem.repository;

import org.kopiitem.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import java.util.Collection;

/**
 * Created by DonnyLies on 7/24/2016.
 */
@RepositoryRestController
public interface CategoryRepository extends JpaRepository<Category, Long> {
    @RestResource(path = "by-name")
    Collection<Category> findByNameContaining(@Param("name") String name);

}

