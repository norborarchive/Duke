package thjug.robo.facade;

import javax.inject.Singleton;

import thjug.robo.define.Currency;
import static thjug.robo.define.Currency.*;

/**
 * Created by pasoktummarungsri on 12/21/14.
 */
@Singleton
public class ExchangeRate {

    public double convert(final Currency from, final Currency to, final double amount) {
        if (from == USD && to == THB)
            return amount * 30;

        throw new IllegalArgumentException("Currency not support");
    }
}
