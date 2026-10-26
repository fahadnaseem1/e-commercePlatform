package com.ecommerce.project.controller;

import com.ecommerce.project.model.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CategoryController {

    private List<Category> categories = new ArrayList<>();

    @GetMapping("/api/public/category")
    public List<Category> getAllCategories(){
        return categories;
    }

    @PostMapping("/api/public/category")
    public String createCategory(@RequestBody Category category){
        categories.add(category);
        return "category created successfully";
    }


}
