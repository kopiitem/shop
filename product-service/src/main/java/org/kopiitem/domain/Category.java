package org.kopiitem.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by DonnyLies on 7/24/2016.
 */
@Entity(name = "category")
public class Category {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String tag;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "category")
    @JsonIgnore
    @JsonProperty("geonames")
    private Set<Product> products;

    public Category() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tag='" + tag + '\'' +
                ", products=" + products +
                '}';
    }
}
