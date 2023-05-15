package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    @DisplayName("Should add the given negative number to the current value")
    void adunareWithNegativeNumber() {
        double x = 10;
        double a = -5;
        Calculator calculator = new Calculator(x);

        Calculator result = calculator.adunare(a);

        assertEquals(x + a,result.val());
    }

    @Test
    @DisplayName("Should add zero to the current value and remain unchanged")
    void adunareWithZero() {
        double initialValue = 10.0;
        double valueToAdd = 0.0;
        Calculator calculator = new Calculator(initialValue);

        Calculator result = calculator.adunare(valueToAdd);

        assertEquals(initialValue, result.val());
    }

    @Test
    @DisplayName("Should add the given number to the current value")
    void adunareWithPositiveNumber() {
        double x = 10.0;
        double a = 5.0;
        Calculator calculator = new Calculator(x);

        Calculator result = calculator.adunare(a);

        assertEquals(x + a, result.val());
    }
    @Test
    @DisplayName("Should modulo by zero")
    void moduloCuZero() {
        double x = 10.0;
        double a = 0;
        Calculator calculator = new Calculator(x);

        assertEquals(x % a,"Numarul trebuie sa fie diferit de zero");
    }
}