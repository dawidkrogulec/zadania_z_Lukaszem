package main;

import java.security.Permission;

public class Main {
    public static void main(String[] args) {
        System.out.println("Elo Dawid");

        Person lucas = new Person("Lucas", 25);
        Person dawid = new Person("Dawid", 29);

        dawid.setAge(dawid.getAge()+10);
        System.out.println("Dawid age " + dawid.getAge());

        dawid.setAge(dawid.addAge(dawid.getAge(), 12));
        System.out.println("Dawid age " + dawid.getAge());
        dawid.setCommonField("wartosć wspolna dla wszystkich obiektow klasy Person");
        lucas.displayCommonField();
        
    }



}
