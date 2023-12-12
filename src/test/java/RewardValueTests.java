import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }
    // One of them must test the ability of the RewardValue class to convert from cash to miles.
    // The other must test its ability to convert from miles to cash.
    // Be sure to check that the conversion rate is accurate!

    private final double CONVERSION_RATE = 0.0035;
    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 1000.00;
        int mileValue = (int) (cashValue * CONVERSION_RATE);
        var rewardValue = new RewardValue(cashValue);
        assertEquals(mileValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        int mileValue = 1000;
        double cashValue = (double) (mileValue / CONVERSION_RATE);
        var rewardValue = new RewardValue(mileValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }
}
