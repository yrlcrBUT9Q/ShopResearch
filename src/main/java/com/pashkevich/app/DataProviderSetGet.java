package com.pashkevich.app;

import java.util.Arrays;

public record DataProviderSetGet() {

    public void setProductNames(String[] fruitsString) { //
        DataFruits.setFruits(fruitsString);
    }

    public void setSalesAmounts(Double[] fruitPrice) { //{1520.89, 2058.35, 1807.29, 899.99, 1924.25}
        DataFruits.setPrice(fruitPrice);
    }

    public String[] getProductNames() {
        return DataFruits.getFruits();
    }

    public String[] getProductPrice() {
        return Arrays.stream(DataFruits.getPrice())
                .map(String::valueOf)
                .toArray(String[]::new);
    }
}