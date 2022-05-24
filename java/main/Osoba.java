package main;

public class Osoba {
    private String name;
    private String surname;
    private Address address;
    private static int numberOfLegs = 2;

    //Konstruktor klasy Osoba
    //Określa jakiego typu są pola (zmienne) zadeklarowane powyżej
    //Dodając słowo kluczowe this
    public Osoba(String name, String surname, Address address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
