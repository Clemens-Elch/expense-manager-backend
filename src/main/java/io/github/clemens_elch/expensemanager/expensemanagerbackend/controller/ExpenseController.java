package io.github.clemens_elch.expensemanager.expensemanagerbackend.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")

public class ExpenseController {

    @GetMapping("/categories")
    List<String> categories() {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Test");
        arrayList.add("Testtest");


        return arrayList;
    }
}
