package org.example.chapter11;

import java.math.BigDecimal;
import java.util.List;

public class PriceCalculator {
    public BigDecimal calculator(Customer customer, List<Product> products) {
        BigDecimal basePrice = BigDecimal.valueOf(1); /* _products 기반한 계산 */
        BigDecimal discounts = BigDecimal.valueOf(1); /* _customer 기반한 계산 */
        BigDecimal taxes = BigDecimal.valueOf(1); /* _products 기반한 계산 */

        return basePrice.subtract(discounts).add(taxes);
    }
}

