package main;

import java.util.*;

public class Store {

    //Kolejnosc rzeczy w klasie: pola, Konstruktory, gettery i settery, hashCode i equals

    private Set<Order> newOrders = new LinkedHashSet<>();
    private Set<Order> processedOrders = new LinkedHashSet<>();


    public Store() {

    }

    public Store(Set<Order> newOrders, Set<Order> processedOrders) {
        this.newOrders = newOrders;
        this.processedOrders = processedOrders;
    }

    public void processOrder() {
        System.out.println("All new orders: " + newOrders);

        if (newOrders.isEmpty()) {
            throw new NoProcessedOrdersLeft("No more orders to be processed at the moment");
        }
        Iterator<Order> iter = newOrders.iterator();

        if (iter != null && iter.hasNext()) {
            // Display the first element of Map using next() method
            System.out.println(
                    "Currently processing order: "
                            + iter.next());
            newOrders.remove(iter.next());
            processedOrders.add(iter.next());
        };
        System.out.println("Process order: " + processedOrders);
    }
    public void addNewOrders(Order nowe ) //Czescia składowa metody jest: modyfikator dostepu, typ nzwracany, nazwa metody i w () jeden lub więcej elementow. Kazdy z tych argumentów musi miec typ, oraz nazwe do ktorej mozemy sie odwolac wewnatrz tej metody
    {
        newOrders.add(nowe); //Wewnatrz metody posluguje sie nazwami ktore nadamy w sygnaturze metody.
        if (nowe == null){
            throw new NoProcessedOrdersLeft("No more orders to be processed at the moment");
        }
    }


    public void setProcessedOrders(Set<Order> processedOrders) {
        this.processedOrders = processedOrders;

    }

}