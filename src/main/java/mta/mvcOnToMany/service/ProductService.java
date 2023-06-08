package mta.mvcOnToMany.service;

import java.util.List;

import mta.mvcOnToMany.entity.Category;
import mta.mvcOnToMany.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import mta.mvcOnToMany.entity.Product;
import mta.mvcOnToMany.repository.ProductRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    private CategoryRepository categoryRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public void addProduct(Product product) {
        productRepository.save(product);
    }

    public void updateProduct(Product product) {
        productRepository.save(product);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
    public void addProductByCategory(Long categoryId, Product product) {
        Category category = getCategoryById(categoryId);

        product.setCategory(category);

        productRepository.save(product);
    }
    public Category getCategoryById(Long id) {
        return categoryRepository.findById(id).orElse(null);
    }
}
