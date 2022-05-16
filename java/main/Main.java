package main;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Elo Dawid");

        Person karol = new Person("Karol", 37);
        Person lucas = new Person("Lucas", 25);
        Person dawid = new Person("Dawid", 29);
        Person modifiedDawid = new Person("ModifiedDawid", 21);

        dawid.setAge(dawid.getAge()+10);
        System.out.println("Dawid age " + dawid.getAge());

        dawid.setAge(dawid.addAge(dawid.getAge(), 12));
        System.out.println("Dawid age " + dawid.getAge());
        dawid.setCommonField("wartosć wspolna dla wszystkich obiektow klasy Person");
        lucas.displayCommonField();
        //Zadeklaruj liste typu BasicInterface
        //Utworzyc 3 obiekty, po; jednym z kazdej klasy karol dawid lukasz
        //Wstaw teg el.em enty do listy utworzonej 2 kroki wczrsniej
        //Wy§wolaj metode displayClassNames i podaj tą liste jako parametr do tej metody
        List<BasicInterface> basicInterface = new ArrayList<>();
        basicInterface.add(karol);
        basicInterface.add(dawid);
        basicInterface.add(lucas);
        basicInterface.add(modifiedDawid);

        displayClassNames(basicInterface);
    }
    int addAge(int age, int years) {
        age = age + years;

        return age;
    }
    public static void displayClassNames(List<BasicInterface> interfaces) {
        for (int i = 0; i < interfaces.size() - 1; i++) {
            interfaces.get(i).displayMyName();
        }
//wywolaj metode populateteammembers podajc wartosci tomek lucas dawid
    }
}
