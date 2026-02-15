package com.example.Expense.Tracker.API.repository;

import com.example.Expense.Tracker.API.entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}
