package br.com.mariojp.solid.ocp;

import java.math.BigDecimal;

public class PremiumPolicy implements DiscountPolicy {
    @Override
    public BigDecimal apply(BigDecimal total) {
        return total.multiply(new BigDecimal("0.90"));
    }
}
