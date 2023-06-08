package mta.mvcOnToMany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mta.mvcOnToMany.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
