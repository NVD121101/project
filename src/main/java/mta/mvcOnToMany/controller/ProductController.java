package mta.mvcOnToMany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import mta.mvcOnToMany.entity.Product;
import mta.mvcOnToMany.service.ProductService;

@RestController
@RequestMapping("/api/")
public class ProductController {
    @Autowired
    private ProductService productService;

    @CrossOrigin
    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
    @CrossOrigin
    @GetMapping("/getid/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }

    @CrossOrigin
    @PutMapping("/products/{id}")
    public void updateProduct(@PathVariable Long id, @RequestBody Product product) {
        product.setId(id);
        productService.updateProduct(product);
    }
    @CrossOrigin
    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }

    @CrossOrigin
    @PostMapping("/categories/{category_id}/products")
    public void addProductByCategory(@PathVariable("category_id") Long categoryId, @RequestBody Product product) {
        productService.addProductByCategory(categoryId, product);
    }
}