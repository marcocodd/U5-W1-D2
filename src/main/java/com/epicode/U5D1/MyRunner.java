package com.epicode.U5D1;

import com.epicode.U5D1.entities.Menu;
import com.epicode.U5D1.entities.Order;
import com.epicode.U5D1.entities.StateOrder;
import com.epicode.U5D1.entities.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {
    @Autowired
    private Menu menu;


    @Override
    public void run(String... args) throws Exception {
        System.out.println("CIAO PROVA");
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5D1Application.class);

        Table table1 = (Table) ctx.getBean("Tavolo1");
        Order order1 = new Order(1, StateOrder.Servito, table1.getMaxPersons(), table1);
        order1.addToOrder(menu.getPizzaList().get(1));
        order1.addToOrder(menu.getPizzaList().get(2));
        order1.addToOrder(menu.getPizzaList().get(0));
        order1.addToOrder(menu.getDrinkList().get(2));

        order1.totalOrderPrice();


        System.out.println("Ordine:");
        System.out.println("---------");
        System.out.println("numero ordine: " + order1.getOrderNumber());
        System.out.println("Tavolo: " + order1.getTable().getNumberTable());
        System.out.println("Coperti: " + order1.getCovers());
        System.out.println("Costo per coperto: " + table1.getCoverPrice());
        order1.getFood().forEach(System.out::println);
        System.out.println("Totale ordine: " + order1.getTotalPrice());
        System.out.println(" ");
        System.out.println("------ ");
    }
}
