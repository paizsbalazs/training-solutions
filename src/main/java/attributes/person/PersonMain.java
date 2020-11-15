package attributes.person;

public class PersonMain {

    public static void main(String[] args) {

        Address address = new Address("Hungary" , "Budapest" , "Nem tudomka utca 3", "1901" );
        Person person = new Person("Don Joe", "007");

        System.out.println(address.addressToString());
        System.out.println(person.personToString());

    }
}
