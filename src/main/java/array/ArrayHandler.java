package array;

public class ArrayHandler {

    public boolean contains(int[] source, int itemToFind) {

        for ( int i = 0; i < source.length; i++ ) {
          if (itemToFind == source[i]) {
              return true;
          }
        }

        return false;
    }

    public int find(int[] source, int itemToFind) {

        for ( int i = 0; i < source.length; i++ ) {
            if ( itemToFind == source[i]) {
                return i;
            }
        }

        return -1;
    }


    public static void main(String[] args) {

        ArrayHandler arrayHandler = new ArrayHandler();

        int[] targetArray = new int[]{1, 3, 5, 10};

        System.out.println("contains");
        System.out.println(arrayHandler.contains(targetArray, 8));
        System.out.println(arrayHandler.contains(targetArray, 3));

        System.out.println("find");
        System.out.println(arrayHandler.find(targetArray, 8));
        System.out.println(arrayHandler.find(targetArray, 3));


    }
}
