package week03d02;

import java.util.ArrayList;
import java.util.List;

public class Position {

    private String name;
    private int bonus;

    public Position(String name, int bonus) {
        this.name = name;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public int getBonus() {
        return bonus;
    }

    public static void main(String[] args) {

        List<Position> listPosition = new ArrayList<>();
        listPosition.add(new Position("Hr", 100000) );
        listPosition.add(new Position("Hrm", 150000) );
        listPosition.add(new Position("Hrm", 150000) );

       // for (int i = 0; i < listPosition.size(); i++) {


        //if ( listPosition.toString() < 150000 ) {
          //      System.out.println( Position.class);

         //   }
        //}




    }
}
