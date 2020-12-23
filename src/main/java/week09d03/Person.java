package week09d03;

import java.util.Random;

public class Person {

    private String name;
    private int age;
    private Present present;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Present getPresent() {
        return present;
    }

    public void setPresent() {
        Random rnd = new Random();
        if (this.age>14) {
          int index = rnd.nextInt(Present.values().length-1)+1;
          this.present = Present.values()[index];
        } else {
            this.present = Present.values()[rnd.nextInt(Present.values().length)];
        }
    }
}
