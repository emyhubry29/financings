package fr.formation.financings.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Future;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Positive;

@Entity
@Table(name = "t_financing")
public class Financing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 200)
    private String name;

    @Column(length = 10)
    private String reference;

    @Column(nullable = false)
    @PastOrPresent
    private LocalDate start_date;

    @Future
    @Column(nullable = false)
    private LocalDate end_date;

    @Positive
    @Column(nullable = false)
    private double amount;

    @Positive
    @Column(nullable = false)
    private double rate;

    public Financing() {
    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getReference() {
	return reference;
    }

    public void setReference(String reference) {
	this.reference = reference;
    }

    public LocalDate getStart_date() {
	return start_date;
    }

    public void setStart_date(LocalDate start_date) {
	this.start_date = start_date;
    }

    public LocalDate getEnd_date() {
	return end_date;
    }

    public void setEnd_date(LocalDate end_date) {
	this.end_date = end_date;
    }

    public double getAmount() {
	return amount;
    }

    public void setAmount(double amount) {
	this.amount = amount;
    }

    public double getRate() {
	return rate;
    }

    public void setRate(double rate) {
	this.rate = rate;
    }
}
