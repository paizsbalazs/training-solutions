package week08d04;

public class Main {

    public static void main(String[] args) {

        Trainer trainer = new Trainer(new BadMood());
        Trainer masiktrainer = new Trainer(new GoodMood());

        System.out.println(trainer.givemark());
        System.out.println(masiktrainer.givemark());

    }
}
