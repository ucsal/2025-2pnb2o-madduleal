package br.com.mariojp.solid.ocp;

import java.math.BigDecimal;

public class RegularPolicy implements DiscountPolicy {
    @Override
    public BigDecimal apply(BigDecimal total) {
        return total; // 0% de desconto
    }
}
