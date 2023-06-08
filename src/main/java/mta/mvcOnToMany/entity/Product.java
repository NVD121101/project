package mta.mvcOnToMany.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String img;
    private Long price;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cate_id", nullable = false, referencedColumnName = "cate_id")
    @JsonBackReference
    private Category category;// biến này tên giống mappedBy trong lớp Cart

    public Product() {
    }

    public Product(String name) {
        this.name = name;
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

    public void setImg(String img) {
        this.img = img;
    }

    public String getImg() {
        return img;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getPrice() {
        return price;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }
    public Long getCateId() {
        if (category != null) {
            return category.getCateid();
        }
        return null;
    }

    public void setCateId(Long cateId) {
        if (category == null) {
            category = new Category();
        }
        category.setCateid(cateId);
    }

}
