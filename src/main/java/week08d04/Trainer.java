package week08d04;

public class Trainer implements CanMark{

    private CanMark canMark;

    public Trainer(CanMark canMark) {
        this.canMark = canMark;
    }

    @Override
    public int givemark() {
        return canMark.givemark();
    }
}
