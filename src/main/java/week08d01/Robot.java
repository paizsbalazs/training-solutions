package week08d01;

public class Robot {

    public String move(String lepesek) {
        String position = "";
        int fel = 0;
        int le = 0;
        int bal = 0;
        int jobb = 0;

        for (int i = 0; i < lepesek.length(); i++) {


            if (lepesek.substring(i, i+1).toUpperCase().equals("F") ) {
                fel = fel + 1; } else {

                if (lepesek.substring(i, i+1).toUpperCase().equals("L")) {
                    le = le + 1; } else {

                    if (lepesek.substring(i, i+1).toUpperCase().equals("J")) {
                        jobb = jobb + 1; } else {

                        if (lepesek.substring(i, i+1).toUpperCase().equals("B")) {
                            bal = bal + 1; } else {

                            throw new IllegalArgumentException("Hibás lépés");

                        }

                    }

                }

            }


        }

        int horizontal = 0;
        int vertical = 0;
        horizontal = jobb - bal;
        vertical = fel - le;

        return "x: " + horizontal + " y: " + vertical;
    }
}
