package com.example.apigateway.converters;

public class NumberConverter {
    public static Double convertToDouble (String strNumber) {
        if (strNumber == null) return 0d;
        // BR10,25 US10.25
        String number = strNumber.replaceAll(",",".");
        if (isNumeric(number)) return Double.parseDouble(number);
        return 0d;
    }
    public static boolean isNumeric (String strNumber) {
        if (strNumber == null) return false;
        String number = strNumber.replaceAll(",",".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }
}
