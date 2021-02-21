package week08d05;

public class MathAlgorithms {

    public int greatestCommonDivisor(int a, int b) {
        int lko = 1;

        for (int i = 2; i <= b && i <= a; i++) {

            if (b % i == 0 && a % i == 0) {
                lko = i;
            }

        }

        return lko;
    }
}
