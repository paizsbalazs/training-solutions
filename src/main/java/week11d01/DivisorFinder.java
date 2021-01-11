package week11d01;

import static java.lang.Integer.parseInt;

public class DivisorFinder {

    public int findDivisor(int n) {
        int result = 0;
        String numbers = Integer.toString(n);

        for (int i = 0; i<numbers.length(); i++) {

            int digit = Integer.parseInt(String.valueOf(numbers.charAt(i)));

            if (n % digit == 0 ) {
                result = result + 1;
            }
        }

        return result;
    }
}
