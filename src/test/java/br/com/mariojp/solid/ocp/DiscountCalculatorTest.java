package br.com.mariojp.solid.ocp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Map;
import java.util.EnumMap;

public class DiscountCalculatorTest {

    @Test
    void partner_gets_12_percent() {
        Map<CustomerType, DiscountPolicy> policies = new EnumMap<>(CustomerType.class);
        policies.put(CustomerType.REGULAR,  new RegularPolicy());
        policies.put(CustomerType.PREMIUM,  new PremiumPolicy());
        policies.put(CustomerType.PARTNER,  new PartnerPolicy()); // 12% OFF na PartnerPolicy

        var calc = new DiscountCalculator(policies);

        assertEquals(88.0, calc.apply(100.0, CustomerType.PARTNER), 1e-4,
                "PARTNER deveria ter 12% de desconto");
    }
}
