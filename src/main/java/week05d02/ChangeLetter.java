package week05d02;

import javaapi.Upper;

public class ChangeLetter {

    private String keres = "AEOUI";

    public String getKeres() {
        return keres;
    }

    public String changeLetter(String input) {
        String s = "";

        for (int k = 0; k < input.length(); k++) {
            if (keres.contains(input.substring(k, k+1).toUpperCase())) {
                s = s + "*";
            } else {
                s = s + input.substring(k, k+1);
            }
        }
        return s;
    }

}
