package com.ecommerce.project.model;

public class Category {
    private int CategoryId;
    private int CategoryName;

    public Category(int categoryId, int categoryName) {
        CategoryId = categoryId;
        CategoryName = categoryName;
    }

    public int getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(int categoryId) {
        CategoryId = categoryId;
    }

    public int getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(int categoryName) {
        CategoryName = categoryName;
    }

}
