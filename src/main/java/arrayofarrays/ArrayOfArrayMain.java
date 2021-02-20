package arrayofarrays;

public class ArrayOfArrayMain {

    public void printArrayOfArray(int[][] a) {
        String s = "";
        for (int i[] : a) {
            for (int j : i) {
                s = s + "" + j + " ";
            }
            System.out.println(s);
            s = "";
        }
    }

    public int[][] multiplicationTable(int size) {

        int[][] multiplicationTable = new int[size][size];

        for ( int i=0; i < multiplicationTable.length; i++) {
            for ( int j=0; j < multiplicationTable.length; j++) {
                multiplicationTable[i][j] = (i + 1) * ( j + 1 );
            }
        }

        return  multiplicationTable;

    }

    public static void main(String[] args) {
        ArrayOfArrayMain arrayOfArrayMain = new ArrayOfArrayMain();
        System.out.println("Multiplication table");

        arrayOfArrayMain.printArrayOfArray(arrayOfArrayMain.multiplicationTable(4));

    }

}
