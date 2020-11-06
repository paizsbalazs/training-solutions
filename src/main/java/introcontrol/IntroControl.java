package introcontrol;

import javax.print.attribute.standard.PresentationDirection;
import javax.swing.*;

public class IntroControl {

    public int substractTenIfGreaterThenTen(int Number)  {

         if (Number >= 10) {
             Number = Number - 10;
         }
         return Number;

    }

    public String describeNumber(int number) {

        if (number == 0) {
            return "zero";
        } else {
            return "not zero";
        }
    }

    public String greetingToJoe(String name) {

        if (name == "Joe") {
            return "Hello Joe!";
        } else {
            return "";
        }

    }

    public int calculateBonus(int Sale) {

        if (Sale >= 1000000) {
            return Sale / 10;
        } else {
            return 0;
        }

    }

    public int calculateConsumption(int prev, int next) {

        if (prev <= next) {
          return prev - next;
        } else {
          return 10000 - prev + next;
        }
    }

    public void printNumbers(int max) {

        for (int i = 0; i <= max;i++ ) {
            System.out.println(i);
        }
    }

    public void printNumbersBetween(int min, int max) {

        for (int i = min + 1; i < max; i++) {
            System.out.println(i);
        }
    }

    public void printOddNumbers(int max) {

        for ( int i = 1; i <= max; i = i + 2 ) {
            System.out.println(i);
        }
    }

    public void printNumbersBetweenAnyDirection(int a, int b) {

        if (a > b) {
            for (int i = a; i > b; i--) {
                System.out.println(i);
            }
        } else {
                for (int i = a; i < b ; i++) {
                    System.out.println(i);
                }
            }

        }
    }


