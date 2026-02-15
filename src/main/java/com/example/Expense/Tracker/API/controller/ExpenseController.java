package com.example.Expense.Tracker.API.controller;

import com.example.Expense.Tracker.API.entity.Expense;
import com.example.Expense.Tracker.API.service.ExpenseService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class ExpenseController {

    private final ExpenseService service;

    public ExpenseController(ExpenseService service) {
        this.service = service;
    }
    @PostMapping
    public ResponseEntity<Expense> createExpense(@Valid @RequestBody Expense expense) {
        Expense saved = service.createExpense(expense);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }

    // READ ALL
    @GetMapping
    public ResponseEntity<List<Expense>> getAllExpenses() {
        return ResponseEntity.ok(service.getAllExpenses());
    }

    // READ BY ID
    @GetMapping("/{id}")
    public ResponseEntity<Expense> getExpenseById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getExpenseById(id));
    }

    // UPDATE
    @PutMapping("/{id}")
    public ResponseEntity<Expense> updateExpense(
            @PathVariable Long id,
            @Valid @RequestBody Expense expense) {

        return ResponseEntity.ok(service.updateExpense(id, expense));
    }

    // DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteExpense(@PathVariable Long id) {
        service.deleteExpense(id);
        return ResponseEntity.noContent().build();
    }
}
