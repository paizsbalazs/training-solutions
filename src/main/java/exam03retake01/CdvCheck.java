package exam03retake01;

public class CdvCheck {

    public boolean check(String s) {
        int multiple = 1;
        int result = 0;

        if (s.length()!=10) {
            throw new IllegalArgumentException(s);
        }

        char[] c = s.toCharArray();

        for (int e = 0; e < 9; e ++) {
           if (Character.isAlphabetic(c[e])) {
               throw new IllegalArgumentException(s);
           } else {
               result = result + (multiple * Character.getNumericValue(c[e]));
               multiple = multiple + 1;
           }
        }

        if (result%11==Character.getNumericValue(c[9])) {
            return true;
        } else {
            return false;
        }

    }
}
