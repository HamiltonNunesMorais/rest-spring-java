package com.example.apigateway.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.apigateway.converters.NumberConverter;
import com.example.apigateway.exceptions.UnsupportedMathOperationException;
import com.example.apigateway.utilities.SimpleMath;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;


@RestController

public class MathController {
    private static final Logger logger = LoggerFactory.getLogger(MathController.class);
    private  final AtomicLong counter = new AtomicLong();
    private SimpleMath math = new SimpleMath();
    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sum(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo) throws Exception {

        logger.info("Recebida requisição para soma: numberOne={}, numberTwo={}", numberOne, numberTwo);

        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            logger.warn("Valores inválidos recebidos: numberOne={}, numberTwo={}", numberOne, numberTwo);
            throw new UnsupportedMathOperationException("Please Set a numeric value");
        }

        double num1 = NumberConverter.convertToDouble(numberOne);
        double num2 = NumberConverter.convertToDouble(numberTwo);
        double result = math.sum(num1, num2);

        logger.info("Resultado da soma: {} + {} = {}", num1, num2, result);
        return result;
    }
    @RequestMapping(value = "/sub/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sub(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo) throws Exception {

        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please Set a numeric value");
        }

        return math.sub (NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }
    @RequestMapping(value = "/mult/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double mult(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo) throws Exception {

        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please Set a numeric value");
        }

        return math.mult (NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }
    @RequestMapping(value = "/div/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double div(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo) throws Exception {

        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please Set a numeric value");
        }

        return math.div (NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }
    @RequestMapping(value = "/mean/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double mean(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo) throws Exception {

        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please Set a numeric value");
        }

        return math.mean (NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }
    @RequestMapping(value = "/square/{number}", method = RequestMethod.GET)
    public Double square(
            @PathVariable("number") String number) throws Exception {

        if (!NumberConverter.isNumeric(number)) {
            throw new UnsupportedMathOperationException("Please Set a numeric value");
        }

        return math.square (NumberConverter.convertToDouble(number));
    }
}
