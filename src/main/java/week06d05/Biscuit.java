package week06d05;

public class Biscuit {

    public static Biscuit of(BiscuitType biscuitType, int gramAmount ) {
        Biscuit resultBiscuit = new Biscuit();
        resultBiscuit.gramAmount = gramAmount;
        resultBiscuit.type = biscuitType;
        //System.out.println(resultBiscuit.gramAmount + "" + resultBiscuit.type.name());
        return resultBiscuit;
    };


   private BiscuitType type;
   private int gramAmount;

    public BiscuitType getType() {
        return type;
    }

    public int getGramAmount() {
        return gramAmount;
    }

    public Biscuit() {
    }

    public Biscuit(BiscuitType type) {
        this.type = type;
    }

    public Biscuit(BiscuitType type, int gramAmount) {
        this.type = type;
        this.gramAmount = gramAmount;
    }
}
