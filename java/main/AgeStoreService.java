package main;


import java.util.HashMap;
import java.util.Map;

public class AgeStoreService {

    private static Map<Integer, Integer> ageStore = new HashMap<>();

    public static Map<Integer, Integer> getAgeStore() {

        return ageStore;
    }

    public AgeStoreService() {

    }

    public static void storeAgeOfPerson(int age) {

        if (ageStore.containsKey(age)) {
            int newAgeCount = ageStore.get(age) + 1;
            ageStore.put(age, newAgeCount);
        }
        else {
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

    public static void checkHowManyPeopleHaveAge(int age) {
        //if klucz istnieje
        //return wartość dla tego klucza
        //else
        //return 0

        if (ageStore.containsKey(age)) {
            System.out.println(ageStore.get(age));
        } else {
            System.out.println(0);
        }
    }
}