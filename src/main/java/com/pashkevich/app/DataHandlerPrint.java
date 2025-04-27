package com.pashkevich.app;

public class DataHandlerPrint {

    public static String printData(String[] items) {

        StringBuilder sb = new StringBuilder();
        int count = 0;

        for (String item : items) {
            sb.append(String.format("(%d) %s ", ++count, item));
        }

        return sb.toString();
    }
}
