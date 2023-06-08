package mta.mvcOnToMany.controller;

import mta.mvcOnToMany.entity.Category;
import mta.mvcOnToMany.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @CrossOrigin
    @GetMapping("/categories")
    public List<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }
    @CrossOrigin
    @GetMapping("/categories/{id}")
    public Category getCategoryById(@PathVariable Long id) {
        return categoryService.getCategoryById(id);
    }
    @CrossOrigin
    @PostMapping("/categories")
    public void addCategory(@RequestBody Category category) {
        categoryService.addCategory(category);
    }
    @CrossOrigin
    @PutMapping("categories/{id}")
    public void updateCategory(@PathVariable Long id, @RequestBody Category category) {
        category.setCateid(id);
        categoryService.updateCategory(category);
    }
    @CrossOrigin
    @DeleteMapping("categories/{id}")
    public void deleteCategory(@PathVariable Long id) {
        categoryService.deleteCategory(id);
    }
}
