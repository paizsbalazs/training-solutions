package introcontrol;

public interface IntroControlMain {

    public static void main(String[] args) {

        IntroControl introControl = new IntroControl();
        System.out.println(introControl.substractTenIfGreaterThenTen(24));
        System.out.println(introControl.describeNumber(0));
        System.out.println(introControl.greetingToJoe("Tibi"));
        System.out.println(introControl.calculateBonus(100000));
        System.out.println(introControl.calculateConsumption(500, 6000));
        introControl.printNumbers(10);
        introControl.printNumbersBetween(10, 15);
        introControl.printNumbersBetweenAnyDirection(50, 40);
        introControl.printOddNumbers(10);
    }
}
