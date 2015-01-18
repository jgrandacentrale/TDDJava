import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;

/**
 * Created by Jgrand on 18/01/2015.
 */
public class MoneyTest {
    @Test
    public void testMultiplication(){
        Dollar five= new Dollar(5);
        five.times(2);
        assertEquals(10,five.amount);
    }
}
