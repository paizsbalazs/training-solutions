package week03;

import java.util.Scanner;

public class Operation {

    private int left;
    private int right;

    public Operation(String Operation) {
        int i = Operation.indexOf("+");

        String lefts = Operation.substring(0, i);

        String rights = Operation.substring(i, Operation.length());
        this.left = Integer.parseInt(lefts);
        this.right = Integer.parseInt(rights);
    }

    public int getResult() {
        return  this.left + this.right;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem a műveletet");
        String read = scanner.nextLine();
        Operation operation = new Operation(read);
        System.out.println(operation.getResult());

    }

}
