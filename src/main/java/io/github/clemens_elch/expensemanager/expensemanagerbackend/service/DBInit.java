package io.github.clemens_elch.expensemanager.expensemanagerbackend.service;

import io.github.clemens_elch.expensemanager.expensemanagerbackend.model.Category;
import io.github.clemens_elch.expensemanager.expensemanagerbackend.repository.CategoryRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class DBInit {
    @Autowired
    CategoryRepository categoryRepository;

    @PostConstruct
    void initDb(){
        Category categoryTest = new Category();
        categoryTest.setName("Test Category");
        categoryTest.setDescription("Test Category Description");
        categoryRepository.save(categoryTest);
    }

}
