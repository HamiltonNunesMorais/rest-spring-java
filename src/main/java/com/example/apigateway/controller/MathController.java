package com.example.apigateway.controller;

import com.example.apigateway.exceptions.UnsupportedMathOperationException;
import org.springframework.web.bind.annotation.*;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class MathController {

    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sum(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo) throws Exception {

        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please Set a numeric value");
        }

        return convertToDouble(numberOne) + convertToDouble(numberTwo);
    }
    private static Double convertToDouble (String strNumber) {
        if (strNumber == null) return 0d;
        // BR10,25 US10.25
        String number = strNumber.replaceAll(",",".");
        if (isNumeric(number)) return Double.parseDouble(number);
        return 0d;
    }
    private static boolean isNumeric (String strNumber) {
        if (strNumber == null) return false;
        String number = strNumber.replaceAll(",",".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }
}
