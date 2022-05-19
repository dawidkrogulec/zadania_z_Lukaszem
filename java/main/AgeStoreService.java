package main;

import java.util.HashMap;

public class AgeStoreService {

    private static HashMap<Integer, Integer> ageStore;


    public static void setAgeStore(HashMap<Integer, Integer> ageStore) {
        AgeStoreService.ageStore = ageStore;
        
        ageStore.put(1, 33);
        ageStore.put(2, 31);
        ageStore.put(3, 27);
        ageStore.put(4, 33);
        ageStore.put(5, 37);
    }

    public static HashMap<Integer, Integer> getAgeStore() {
        return ageStore;
    }

    public void storeAgeOfPerson(int age) {

    }
    public int checkHowManyPeopleHaveAge(int age) {

        return age;
    }
}
