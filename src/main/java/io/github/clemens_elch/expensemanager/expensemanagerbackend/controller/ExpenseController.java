package io.github.clemens_elch.expensemanager.expensemanagerbackend.controller;


import io.github.clemens_elch.expensemanager.expensemanagerbackend.model.Category;
import io.github.clemens_elch.expensemanager.expensemanagerbackend.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")

public class ExpenseController {

    @Autowired
    CategoryRepository categoryRepository;


    @GetMapping("/categories")
    List<Category> getCategories() {
        return categoryRepository.findAll();

    }
}