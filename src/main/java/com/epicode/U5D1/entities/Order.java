package com.epicode.U5D1.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Order {
    private int orderNumber;
    private StateOrder state;

    @Value("${cover.price}")
    private int coverPrice;
    private int covers;
    private LocalDate orderDate;
    private List<Item> food;
    private double totalPrice;
    @Autowired
    private Table table;

    public Order(int orderNumber, StateOrder state, int covers, Table table) {
        this.orderNumber = orderNumber;
        this.state = state;
        this.covers = covers;
        this.orderDate = LocalDate.now();
        this.food = new ArrayList<>();
        this.table = table;

    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public StateOrder getState() {
        return state;
    }

    public void setState(StateOrder state) {
        this.state = state;
    }

    public int getCovers() {
        return covers;
    }

    public void setCovers(int covers) {
        this.covers = covers;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public List<Item> getFood() {
        return food;
    }

    public void setFood(List<Item> food) {
        this.food = food;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public void addToOrder(Item item) {
        food.add(item);
    }

    public void totalOrderPrice() {
        double price = 0;
        for (Item item : food) {
            price += item.getPrice();
        }

        price += table.getMaxPersons() * coverPrice;
        this.totalPrice = price;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber=" + orderNumber +
                ", state=" + state +
                ", coverPrice=" + coverPrice +
                ", covers=" + covers +
                ", orderDate=" + orderDate +
                ", food=" + food +
                ", totalPrice=" + totalPrice +
                ", table=" + table +
                '}';
    }
}
