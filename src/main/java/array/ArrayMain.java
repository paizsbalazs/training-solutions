package array;

public class ArrayMain {

    public static void main(String[] args) {

        String[] arrayOfDays = {"Hétfő", "Kedd", "Szerda", "Csütörtök", "Péntek", "Szombat", "Vasárnap"};
        System.out.println(arrayOfDays[1]);

        int[] arrayOfNumbers = {1, 2, 4, 8, 16};

        for ( int i = 0; i < arrayOfNumbers.length; i++ ) {
            System.out.println(arrayOfNumbers[i]);
        }

        boolean[] arrayOfStat = new boolean[6];

        for (int i = 1; i < arrayOfStat.length; i++) {
            arrayOfStat[i] = !arrayOfStat[ i - 1];
        }

        for (int i = 0; i < arrayOfStat.length; i++) {
            System.out.println(arrayOfStat[i] + "");
        }

    }


}
