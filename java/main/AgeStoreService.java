package main;


import java.util.HashMap;
import java.util.Map;

public class AgeStoreService {

    private static Map<Integer, Integer> ageStore = new HashMap<>(); //Na podstawie implementacji interfejsu Map, tworzymy nowy prywatny obiekt typu Map, który  (HashMapa swoje działanie opiera na tablicy obiektów klasy statycznej HashMap) i nadajemy mu nazwę ageStore.
                                                                     //Mapa jako parametry przyjmuje <klucz, wartość>. operuje na podstawie klucza, czyli przypisuje wartość do konkretnego klucza
    public static Map<Integer, Integer> getAgeStore() { // Tworzymy publiczną, stayczną metodę getAgeStore, która w wyniku zwraca wartość pobraną z Mapy utworzonej powyżej

        return ageStore; // Operując na podstawie klucza Mapy ageStore<klucz, wartość>, jako wynik zwraca nam wartość jaka jest do niego przypisana
    }

    public AgeStoreService() {       //Konstruktor klasy AgeStoreService

    }

    public static void storeAgeOfPerson(int age) {  //Tworzymy publiczną, statyczną metodę storeAgeOfPerson, która w tym przypadku zwróci (void) nam wiek

        if (ageStore.containsKey(age)) {            //Ciało metody ageStore. Przy pomocy instrukcji warunkowych if else sprawdzamy,czy w Mapie jest zapisany klucz z interesującą nas wartością wieku
            int newAgeCount = ageStore.get(age) + 1;//Jeżeli taki klucz istnieje, to pobiera jego wartość i zwiększa o 1
            ageStore.put(age, newAgeCount);         //Następnie zapisuje jego wartość
        }
        else {                                      //Jeżeli nie istnieje, to zapisuje klucz z artością wieku
            ageStore.put(age, 1);
        }


    }

    //Najpierw sprawdzam, czy dany klucz w mapie juz istnieje
    //Jeżeli nie istnieje, to zapisuje klucz z wartością wieku
    //Jeżeli klucz istnieje, to muszę pobrać obecna wartość tego klucza i zwiększyć ją o 1 (if else)
    //if klucz nie istnieje
    //dodaj do listy z wartością 1
    //else
    //pobierz o becną wartość i zwiększ o 1

    public static void checkHowManyPeopleHaveAge(int age) {  //Tworzymy publiczną, statyczną metodę o nazwie checkHowManyPeopleHaveAge, która jako argument przyjmuje wiek(age) i zwraca jego wartość(void)
        //if klucz istnieje
        //return wartość dla tego klucza
        //else
        //return 0

        if (ageStore.containsKey(age)) {                    //Za pomocą instrukcji warunkowych if else, sprawdzamy ile razy pojawia się w Mapie dany klucz
            System.out.println(ageStore.get(age));          //Jeżeli klucz istnieje, to wyświetla w konsoli jego wartość
        } else {
            System.out.println(0);                          //Jeżeli nie istnieje, to wyświetla w konsoli warość 0
        }
    }
}