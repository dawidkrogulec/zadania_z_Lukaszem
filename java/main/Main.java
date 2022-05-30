package main;

import java.util.*;

import static main.AddressStore.checkAddressStoreSize;
import static main.AgeStoreService.*;

public class Main {
    public static void main(String[] args) {

        Order one = new Order(0,"First order");
        Order two = new Order(1,"Second order");
        Order three = new Order(2,"Third order");
        Order four = new Order(3,"Fourth order");

        Set<Order> orders = new LinkedHashSet<>();
        orders.add(one);
        orders.add(two);
        orders.add(three);
        orders.add(four);

        Store store = new Store();
        store.setNewOrders(orders);

        store.processOrder();

//        storeAgeOfPerson(27);
//        storeAgeOfPerson(27);
//        storeAgeOfPerson(32);
//        storeAgeOfPerson(22);
//        storeAgeOfPerson(36);
//        storeAgeOfPerson(36);
//        storeAgeOfPerson(36);
//
//
//        checkHowManyPeopleHaveAge(27);
//        checkHowManyPeopleHaveAge(65);
//        checkHowManyPeopleHaveAge(36);
//        checkHowManyPeopleHaveAge(99);
//        checkHowManyPeopleHaveAge(32);



//        Person karol = new Person("Karol", 37); //Tworzę nowy obiekt typu Person o nazwie karol i nadaję mu wiek 37 lat
//        Person lucas = new Person("Lucas", 25);
//        Person dawid = new Person("Dawid", 29);
//        Person modifiedDawid = new Person("ModifiedDawid", 21);
//
//        dawid.setAge(dawid.getAge()+10);
//        System.out.println("Dawid age " + dawid.getAge());
//
//        dawid.setAge(dawid.addAge(dawid.getAge(), 12));
//        System.out.println("Dawid age " + dawid.getAge());
//        dawid.setCommonField("wartosć wspolna dla wszystkich obiektow klasy Person");
//        lucas.displayCommonField();
//
//        List<BasicInterface> basicInterface = new ArrayList<>();
//        basicInterface.add(karol);
//        basicInterface.add(dawid);
//        basicInterface.add(lucas);
//        basicInterface.add(modifiedDawid);

//        displayClassNames(basicInterface);
//
//        Address abc = new Address("Gdansk");
//
//
//        Osoba osoba1 = new Osoba("Karol", "Krogulec", abc);
//        Osoba osoba2 = new Osoba("Dawid", "Krogulec", new Address("Wejherowo"));
//
//        storeNewAddress(osoba1);
//        storeNewAddress(osoba2);
//
//        checkAddressStoreSize();

//        Map<Integer, String> movies = new HashMap<Integer, String>();
//        movies.put(1, "Joker");
//        movies.put(2, "Jurassic World");
//        movies.put(3, "Ulubiony film Dawida");
//        movies.put(3, "Ulubiony film Lukasza");
//        String movie = movies.get(3);
//        System.out.println(movie);

    checkAddressStoreSize();

    }


    int addAge(int age, int years) {
        age = age + years;

        return age;
    }
    public static void displayClassNames(List<BasicInterface> interfaces) {
        for (int i = 0; i < interfaces.size() - 1; i++) {
            interfaces.get(i).displayMyName();
        }

    }

}
