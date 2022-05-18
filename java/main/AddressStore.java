package main;

import java.util.ArrayList;
import java.util.List;

public class AddressStore {

    private static final List<String> addresses = new ArrayList<>();

    public static void storeNewAddress(Osoba osoba) {
        Address address = osoba.getAddress();
        addresses.add(address.getStreet());

    }
    public static void checkAddressStoreSize() {
        System.out.println(addresses.size());

    }
}
