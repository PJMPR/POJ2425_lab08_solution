package com.example.filters;

import java.time.LocalDate;

public class SearchSettings {

    private LocalDate dateFrom;
    private LocalDate dateTo;
    private int mileageTo;
    private int mileageFrom;
    private double priceFrom;
    private double priceTo;
    private String word;
    private int yearFrom;
    private int yearTo;

    public LocalDate getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(LocalDate dateFrom) {
        this.dateFrom = dateFrom;
    }

    public LocalDate getDateTo() {
        return dateTo;
    }

    public void setDateTo(LocalDate dateTo) {
        this.dateTo = dateTo;
    }

    public int getMileageTo() {
        return mileageTo;
    }

    public void setMilleageTo(int mileageTo) {
        this.mileageTo = mileageTo;
    }

    public int getMilLeageFrom() {
        return mileageFrom;
    }

    public void setMileageFrom(int mileageFrom) {
        this.mileageFrom = mileageFrom;
    }

    public double getPriceFrom() {
        return priceFrom;
    }

    public void setPriceFrom(double priceFrom) {
        this.priceFrom = priceFrom;
    }

    public double getPriceTo() {
        return priceTo;
    }

    public void setPriceTo(double priceTo) {
        this.priceTo = priceTo;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getYearFrom() {
        return yearFrom;
    }

    public void setYearFrom(int yearFrom) {
        this.yearFrom = yearFrom;
    }

    public int getYearTo() {
        return yearTo;
    }

    public void setYearTo(int yearTo) {
        this.yearTo = yearTo;
    }
}
