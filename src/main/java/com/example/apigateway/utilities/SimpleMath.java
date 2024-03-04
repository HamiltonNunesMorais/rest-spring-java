package com.example.apigateway.utilities;

import com.example.apigateway.converters.NumberConverter;
public class SimpleMath {

        public Double sum( Double numberOne, Double numberTwo) {

            return numberOne + numberTwo;
        }
        public Double sub( Double numberOne, Double numberTwo) {

            return numberOne - numberTwo;
        }
        public Double mult( Double numberOne, Double numberTwo) {

            return numberOne * numberTwo;
        }
        public Double div( Double numberOne, Double numberTwo) {

            return numberOne / numberTwo;
        }
    public Double mean( Double numberOne, Double numberTwo) {

        return (numberOne + numberTwo) / 2;
    }
    public Double square( Double number) {

        return Math.sqrt(number);
    }
}
