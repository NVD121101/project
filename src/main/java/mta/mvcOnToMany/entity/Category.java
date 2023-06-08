package mta.mvcOnToMany.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cate_id") //
    private Long cateid;
    private String name;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    @JsonManagedReference
    private Set<Product> products;

    public void setCateid(Long cateid) {
        this.cateid = cateid;
    }

    public Long getCateid() {
        return cateid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}