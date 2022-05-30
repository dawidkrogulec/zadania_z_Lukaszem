package main;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

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

    public void addNewOrders(Order nowe ) //Czescia składowa metody jest: modyfikator dostepu, typ nzwracany, nazwa metody i w () jeden lub więcej elementow. Kazdy z tych argumentów musi miec typ, oraz nazwe do ktorej mozemy sie odwolac wewnatrz tej metody
    {
        newOrders.add(nowe); //Wewnatrz metody posluguje sie nazwami ktore nadamy w sygnaturze metody.
        if (nowe == null){
            throw new NoProcessedOrdersLeft("No more orders to be processed at the moment");
        }
    }

    public Set<Order> getNewOrders() {
        return newOrders;
    }

    public void setNewOrders(Set<Order> newOrders) {
        this.newOrders = newOrders;
    }

    public Set<Order> getProcessedOrders() {
        return processedOrders;
    }

    public void setProcessedOrders(Set<Order> processedOrders) {
        this.processedOrders = processedOrders;

    }
}