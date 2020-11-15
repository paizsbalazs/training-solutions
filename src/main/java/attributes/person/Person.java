package attributes.person;

public class Person {

    private String name;
    private String identificationCard;

    public String personToString() {
        return this.name + " " +this.identificationCard;
    }

    public Person(String name, String identificationCard) {
        this.name = name;
        this.identificationCard = identificationCard;
    }

    public void correctData(String name, String identificationcard) {
        this.name = name;
        this.identificationCard = identificationcard;
    }
}
