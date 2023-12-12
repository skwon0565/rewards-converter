import java.math.BigDecimal;

public class RewardValue {
    /*
    This class must satisfy the following requirements:
    RewardValue must have two constructors: one that accepts a cash value and one that accepts a value in miles.
    RewardValue must have a getCashValue() method, which returns the cash value of the RewardValue.
    RewardValue must have a getMilesValue() method, which returns how many miles the RewardValue is worth.
    RewardValue must convert from miles to cash at a rate of 0.0035.
     */
    private double cashValue;
    private final double CONVERSION_RATE = 0.0035;
    private int miles;
    public double getCashValue() {
        return cashValue;
    }
    public double getMilesValue() {
        return cashValue * CONVERSION_RATE;
    }

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }
    public RewardValue(int miles) {
        this.miles = miles;
    }
}
