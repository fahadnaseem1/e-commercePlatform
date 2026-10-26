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
    public List<Category> getAllCategories() {
        return categories;
    }

    @Override
    public void createCategories(Category category) {
        category.setCategoryId(nextId++);
        categories.add(category);
    }
}
