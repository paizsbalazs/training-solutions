package localvariables;

public class LocalVariablesMain {

    public static void main(String[] args) {

        Boolean b;
        b = false;
        System.out.println(b);

        int a = 12;
        int i = 3, j = 4;

        int k = i;

        System.out.println(i + " " + j + " " + k);

        //int teszt;
        //System.out.println(teszt);

        String s = "Hello World!";
        String t = s;

        {
            int x = 3;
        }

        //System.out.println(x);

        int xSecond = 3;

        {
            System.out.println(xSecond);
        }

    }

}
