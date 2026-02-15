package com.example.Expense.Tracker.API.service;

import com.example.Expense.Tracker.API.entity.Expense;
import com.example.Expense.Tracker.API.repository.ExpenseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {

    private final ExpenseRepository repository;


    public ExpenseService(ExpenseRepository repository) {
        this.repository = repository;
    }
    public Expense createExpense(Expense expense) {
        return repository.save(expense);
    }

    // READ ALL
    public List<Expense> getAllExpenses() {
        return repository.findAll();
    }

    // READ BY ID
    public Expense getExpenseById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Expense not found with id " + id));
    }

    // UPDATE
    public Expense updateExpense(Long id, Expense updatedExpense) {

        Expense existing = getExpenseById(id);

        existing.setTitle(updatedExpense.getTitle());
        existing.setAmount(updatedExpense.getAmount());
        existing.setCategory(updatedExpense.getCategory());
        existing.setDate(updatedExpense.getDate());

        return repository.save(existing);
    }

    // DELETE
    public void deleteExpense(Long id) {
        Expense expense = getExpenseById(id);
        repository.delete(expense);
    }
}




