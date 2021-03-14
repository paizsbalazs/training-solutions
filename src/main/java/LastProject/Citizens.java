package LastProject;

import java.time.LocalDateTime;

public class Citizens {

    private String name;
    private String zip;
    private int age;
    private String email;
    private String taj;
    private int number_of_vaccination;
    private LocalDateTime last_vaccination;

    public Citizens(String name, String zip, int age, String email, String taj, int number_of_vaccination, LocalDateTime last_vaccination) {
        this.name = name;
        this.zip = zip;
        this.age = age;
        this.email = email;
        this.taj = taj;
        this.number_of_vaccination = number_of_vaccination;
        this.last_vaccination = last_vaccination;
    }

    public void Registration() {

    }

    public Citizens(String name, String zip, int age, String email, String taj) {
        this.name = name;
        this.zip = zip;
        this.age = age;
        this.email = email;
        this.taj = taj;
    }

    public String getName() {
        return name;
    }

    public String getZip() {
        return zip;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getTaj() {
        return taj;
    }

    public int getNumber_of_vaccination() {
        return number_of_vaccination;
    }

    public LocalDateTime getLast_vaccination() {
        return last_vaccination;
    }

    @Override
    public String toString() {
        return "Citizens{" +
                "name='" + name + '\'' +
                ", zip='" + zip + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", taj='" + taj + '\'' +
                ", number_of_vaccination=" + number_of_vaccination +
                ", last_vaccination=" + last_vaccination +
                '}';
    }
}
