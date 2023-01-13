package com.hunt.model;

public class Order {
    private long id;
    private long employeeId; // ид того кто продал
    private long customerId; // id того кому продали
    private long[] books; //Список номеров книг, которых мы продали


    public Order(long id, long employeeId, long customerId, long[] books) {
        this.id = id;
        this.employeeId = employeeId;
        this.customerId = customerId;
        this.books = books;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public long[] getBooks() {
        return books;
    }

    public void setBooks(long[] books) {
        this.books = books;
    }
}
