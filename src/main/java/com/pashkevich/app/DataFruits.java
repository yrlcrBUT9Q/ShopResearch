package com.pashkevich.app;

public final class DataFruits {

    private static String[] fruits;
    private static Double[] price;

    private DataFruits() {
    }

    public static void setFruits(String[] fruits) {
        DataFruits.fruits = fruits;
    }

    public static void setPrice(Double[] price) {
        DataFruits.price = price;
    }

    public static String[] getFruits() {
        return fruits;
    }

    public static Double[] getPrice() {
        return price;
    }
}