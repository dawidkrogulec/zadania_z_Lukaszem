package main;

import java.util.HashMap;

public class AgeStoreService {

    private static HashMap<Integer, Integer> ageStore;

    public static HashMap<Integer, Integer> getAgeStore() {

        return ageStore;
    }

    public AgeStoreService() {

    }

    public void storeAgeOfPerson(int age) {

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

    public int checkHowManyPeopleHaveAge(int age) {
        //if klucz istnieje
        //return wartość dla tego klucza
        //else
        //return 0

        if (ageStore.containsKey(age)) {
            return ageStore.get(age);
        } else {
            return 0;
        }
    }
}
