package io.github.clemens_elch.expensemanager.expensemanagerbackend.repository;


import io.github.clemens_elch.expensemanager.expensemanagerbackend.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

// Provides database access methods for the Category entity,
// including create, read, update, and delete (CRUD) operations.
// Inherits all standard functionality from JpaRepository.


public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
