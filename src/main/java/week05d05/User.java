package week05d05;

public class User {

    private String firstName;
    private String lastName;
    private String email;

    public User(String firstName, String lastName, String email) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        int occurence = email.indexOf("@");
        if (!email.contains("@") || !email.contains(".")) {
            throw new IllegalArgumentException("Hibás a mail cím");
        }

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return this.getFirstName() + " " + this.getLastName();
    }


}
