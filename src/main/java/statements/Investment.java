package statements;

public class Investment {

    private double cost;
    private int fund;
    private int interestRate;
    private boolean active = true;

    public void setActive(boolean active) {
        this.active = active;
    }

    public double getCost() {
        return cost;
    }

    public int getFund() {
        return fund;
    }

    public int getInterestRate() {
        return interestRate;
    }

    public boolean isActive() {
        return active;
    }

    public Investment(int fund, int interestrate) {
        this.fund = fund;
        this.interestRate = interestrate;
    }

    public double getYield(int days) {
      return fund * interestRate * days / (100.0 * 365);
    }

    public double close(int days) {
        double payment = (getFund() + getYield(days)) * (1 - cost / 100);
        double payout = active ? payment : 0;
        active = false;
        return payout;
    }

}
