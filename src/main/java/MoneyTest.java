import org.junit.Test;

public class MoneyTest {
    @Test
    public void 乗算() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }
}
