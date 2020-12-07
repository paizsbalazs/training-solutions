package week07d01;

import objects.Book;

public class MathAlgorithms {

    private int prime;

    public boolean isPrime(int x) {

        if (x < 1) {
            throw new IllegalArgumentException("Hibás szám");
        }


        Boolean c = false;

        for (int i = 2; i < x; i++) {
            if ( x % i == 0) {
                return c = false;
            } else {
                c = true;
            }
        }

        return c;
    }
}
