package com.ecommerce.project.service;

import com.ecommerce.project.model.Category;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImp implements CategoryService{
    private List<Category> categories = new ArrayList<>();
    private long nextId = 1l;


    @Override
    public List<Category> getAllCategories(){
        return categories;
    }

    @Override
    public void createCategories(Category category) {
        category.setCategoryId(nextId++);
        categories.add(category);
    }

    @Override
    public String deleteCategories(Long categoryId) {
        Category category = categories.stream()
                .filter(c -> c.getCategoryId().equals(categoryId))
                .findFirst()
                .orElse(null);
        if(category == null)
            return "Category not found";
        categories.remove(category);
        return "Category with CategoryId " + categoryId + " deleted successfully";
    }
}
