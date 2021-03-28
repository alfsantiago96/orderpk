package com.hypeflame.job.services;

import com.hypeflame.job.entities.Category;
import com.hypeflame.job.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll(){
        List<Category> categoryList = categoryRepository.findAll();
        return categoryList;
    }

}
