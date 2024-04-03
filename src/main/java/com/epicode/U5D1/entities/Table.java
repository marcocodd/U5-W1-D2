package com.epicode.U5D1.entities;

public class Table {
    private int numberTable;
    private int maxPersons;
    private boolean reserved;

    public Table(int numberTable, int maxPersons, boolean reserved) {
        this.numberTable = numberTable;
        this.maxPersons = maxPersons;
        this.reserved = reserved;
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
}
