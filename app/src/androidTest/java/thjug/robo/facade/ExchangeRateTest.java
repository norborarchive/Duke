package thjug.robo.facade;

import android.test.InstrumentationTestCase;

import thjug.robo.define.Currency;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

/**
 *
 * @author nuboat
 */
public class ExchangeRateTest extends InstrumentationTestCase {

    public void testConvert() throws Exception {
        final Currency from = Currency.USD;
        final Currency to = Currency.THB;
        final double amout = 10;

        final ExchangeRate exchangeRate = new ExchangeRate();
        final double result = exchangeRate.convert(from, to, 10);

        final double expect = 300;

        assertThat(result, equalTo(expect));
    }

}