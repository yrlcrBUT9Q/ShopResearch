package com.pashkevich.app;

import java.util.Arrays;

public class RunnerMain {

    public static void main(String[] args) {

        DataProviderSetGet dataProvider = new DataProviderSetGet();

        dataProvider.setProductNames(new String[]{"apple", "grape", "mango", "apple", "orange"});
        dataProvider.setSalesAmounts(new Double[]{1520.89, 2058.35, 1807.29, 899.99, 1924.25});

        System.out.println("Products: " + DataHandlerPrint.printData(dataProvider.getProductNames()));
        System.out.println("Sales, EUR: " + DataHandlerPrint.printData(dataProvider.getProductPrice()));
    }
}