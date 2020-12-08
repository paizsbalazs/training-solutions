package week07d02;

public class DigitSum{

    public int sumOfDigits(int x) {
        int sum = 0;
        char y;
        String vizs = Integer.toString(x);

        for (int i = 0; i < vizs.length(); i++) {

            y = vizs.charAt(i);
            int b = Integer.parseInt(String.valueOf(y));
            sum=sum+b;

        }
        return sum;
    }

}
