package main;

public class Person {

    private static String commonField;

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    int addAge(int age, int years) {
        age = age + years;
        return age;
    }
    int addAge(String age, String years) {
    return 1;
    }
    public void displayCommonField() {
        System.out.println(getCommonField());
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public String getCommonField() {
        return commonField;
    }

    public void setCommonField(String commonField) {
        Person.commonField = commonField;
    }

}
