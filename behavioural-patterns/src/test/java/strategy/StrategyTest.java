package strategy;

import com.taras.murzenkov.behavior.strategy.code.DiscountCalculationService;
import com.taras.murzenkov.behavior.strategy.code.impl.DiscountCalculationServiceImpl;
import com.taras.murzenkov.behavior.strategy.code.impl.EasterDiscountServiceImpl;
import com.taras.murzenkov.behavior.strategy.code.impl.HolidayDiscountCalculationService;
import com.taras.murzenkov.behavior.strategy.code.model.TypeOfHoliday;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * UTs for the {@link DiscountCalculationService}.
 *
 * @author Taras Murzenkov.
 */
public class StrategyTest {
    private DiscountCalculationService discountCalculationService;

    /**
     * Inits mocks.
     *
     */
    @Before
    public void initStrategies() {
        this.discountCalculationService = new DiscountCalculationServiceImpl();
        this.discountCalculationService.addProgram(TypeOfHoliday.EASTER, new EasterDiscountServiceImpl());
        this.discountCalculationService.addProgram(TypeOfHoliday.HOLIDAY, new HolidayDiscountCalculationService());
    }

    @Test
    public void shouldProperlyAssignDiscountForHoliday() {
        BigDecimal price = BigDecimal.valueOf(10.0);
        BigDecimal discountedPrice = this.discountCalculationService.calculateDiscount(TypeOfHoliday.HOLIDAY, price);
        Assert.assertEquals(discountedPrice, price.multiply(BigDecimal.valueOf(0.5)));
    }

    @Test
    public void shouldProperlyAssignDiscountForEaster() {
        BigDecimal price = BigDecimal.valueOf(10.0);
        BigDecimal discountedPrice = this.discountCalculationService.calculateDiscount(TypeOfHoliday.EASTER, price);
        Assert.assertEquals(discountedPrice, price.multiply(BigDecimal.valueOf(0.9)));
    }
}
