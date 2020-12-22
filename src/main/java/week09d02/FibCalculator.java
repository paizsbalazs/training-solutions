package week09d02;

public class FibCalculator {

    public int sumEvens(int bound) {
        int result = 0;
        int before = 1;
        int next = 1;

        while (next<bound) {
            if (next%2==0) {
                result = result + next;
                next = before + next;
                before = next - before;
            }else {
                next = before + next;
                before = next - before;

            }
        }

        return result;
    }
}
