package main;

import java.util.Objects;

public class Order { // Wszystkie pola w klasie musza miec settery gettery i konstruktor, a klasa musi miec konstruktor

    private Integer orderNumber; //Wszystkie pola w klasie mają być private i nie uzywamy prymitywow
    private String description;

    public Order(int orderNumber, String description) {
        this.orderNumber = orderNumber;
        this.description = description;
    }

    //Mechanizm (metoda) hashCode i equals służy do porównywania ze sobą obiektów, aby sprawdzić, czy mamy już taki obiekt
    //Dla przykładu jest to używane w setach, żeby sprawdzić, czy taki element jest już w Secie
    //Najpierw jest porównywany Hash Code dla 2 obiektów, bo to jest szybkie porównanie licz całkowitych. Jeżeli wynik jest fałszem, to wiemy ze taki element nie istnieje i można go dodać
    //Jezeli Hash Code jest takie same, tob wywoływana jest metoda Equals
    //Metoda Equals jest droga metodą wymagającą wiecej cykli procesora
    //Wmetodzie Equals porównywane sa wszystkie pola, które sa wpisane w metodzie
    //Jeżeli pola sa takie same to wiemy ze mamy duplikat i nie dodajemy do Seta, a jeżeli różne to dodajemy do Seta

    @Override
    public boolean equals(Object o) { //Equals służy do porównywania obiektów
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(orderNumber, order.orderNumber) && Objects.equals(description, order.description);
    }

    @Override
    public int hashCode() { //Służy do szybkiego porównywania HashCode dla obiektu, który jest liczbą całkowitą i jest nadawany przy tworzeniu obiektu
        return Objects.hash(orderNumber, description);
    }

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}

