package stringtype.registration;

public class UserValidator {

    private String name;
    private String mail;
    private String passw;

    public UserValidator(String name, String mail, String passw) {
        this.name = name;
        this.mail = mail;
        this.passw = passw;
    }

    public String getName() {
        return name;
    }

    public String getMail() {
        return mail;
    }

    public String getPassw() {
        return passw;
    }

    public boolean isValidUserName(String name) {
        return !"".equals(name);
    }

    public boolean isValidPassWord(String password1, String password2) {
        return password1.length() >= 8 && password1.equals(password2);
    }

    public boolean isValidEmail(String email) {
        int ittakukac = email.indexOf("@");
        String domain = email.substring(ittakukac + 1);
        int ittapont = email.indexOf(".");
        return ittakukac > 0
                && ittapont > 0
                && ittapont > domain.length() - 1;

    }
}
