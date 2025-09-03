package br.com.mariojp.solid.ocp;

import java.math.BigDecimal;

public interface DiscountPolicy {
    BigDecimal apply(BigDecimal total);



}
