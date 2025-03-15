package com.luka_kuzyk.budget.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "description")
    private String description;

    @Column(name = "amount", nullable = false)
    private Double amount;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "created_on")
    private Instant createdOn;

    @Column(name = "updated_on")
    private Instant updatedOn;

    @Column(name = "currency_code")
    private String currencyCode;

    @Column(name = "expense_category", nullable = false)
    private String expenseCategory;

    @Column(name = "income_category", nullable = false)
    private String incomeCategory;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

}