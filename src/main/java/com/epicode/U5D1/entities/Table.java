package com.epicode.U5D1.entities;

public class Table {
    private int numberTable;
    private int maxPersons;
    private boolean reserved;
    private double coverPrice;

    public Table(int numberTable, int maxPersons, boolean reserved, double coverPrice) {
        this.numberTable = numberTable;
        this.maxPersons = maxPersons;
        this.reserved = reserved;
        this.coverPrice = coverPrice;
    }

    public int getNumberTable() {
        return numberTable;
    }

    public int getMaxPersons() {
        return maxPersons;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void setNumberTable(int numberTable) {
        this.numberTable = numberTable;
    }

    public void setMaxPersons(int maxPersons) {
        this.maxPersons = maxPersons;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    public double getCoverPrice() {
        return coverPrice;
    }

    public void setCoverPrice(double coverPrice) {
        this.coverPrice = coverPrice;
    }

    @Override
    public String toString() {
        return "Table{" +
                "numberTable=" + numberTable +
                ", maxPersons=" + maxPersons +
                ", reserved=" + reserved +
                ", coverPrice=" + coverPrice +
                '}';
    }
}
