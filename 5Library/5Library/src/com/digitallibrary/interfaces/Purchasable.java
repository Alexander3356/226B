package com.digitallibrary.interfaces;

import java.math.BigDecimal;

public interface Purchasable {
    BigDecimal calculatePrice();
    void applyDiscount(double percentage);

    static BigDecimal getDefaultTaxRate() {
        return new BigDecimal("0.22"); // 22% IVA
    }

    default BigDecimal getPriceWithTax() {
        return calculatePrice().multiply(BigDecimal.valueOf(1).add(getDefaultTaxRate()));
    }
}
