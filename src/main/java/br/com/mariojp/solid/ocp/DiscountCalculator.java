package br.com.mariojp.solid.ocp;
import java.math.BigDecimal;


import java.util.Map;

public class DiscountCalculator {

    private final Map<CustomerType, DiscountPolicy> policies;

    public DiscountCalculator(Map<CustomerType, DiscountPolicy> policies) {
        this.policies = policies;
    }

    public double apply(double amount, CustomerType type) {
        DiscountPolicy policy = policies.getOrDefault(type, a -> a); // Sem desconto por padrão
        return policy.apply(BigDecimal.valueOf(amount)).doubleValue();
    }
}
