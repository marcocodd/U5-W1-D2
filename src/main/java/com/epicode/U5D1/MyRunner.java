package com.epicode.U5D1;

import com.epicode.U5D1.entities.Menu;
import com.epicode.U5D1.entities.Order;
import com.epicode.U5D1.entities.StateOrder;
import com.epicode.U5D1.entities.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class MyRunner implements CommandLineRunner {
    @Autowired
    private Menu menu;

    @Override
    public void run(String... args) throws Exception {

        Table table1 = new Table(1, 4, true);
        Order order1 = new Order(1, StateOrder.Servito, table1.getMaxPersons(), table1);
        order1.addToOrder(menu.getPizzaList().get(1));
        order1.addToOrder(menu.getPizzaList().get(2));
        order1.addToOrder(menu.getPizzaList().get(0));

        order1.totalOrderPrice(); // Calcola il prezzo totale dell'ordine

        // Stampa dell'ordine
        System.out.println("Ordine:");
        System.out.println(order1);
    }
}
