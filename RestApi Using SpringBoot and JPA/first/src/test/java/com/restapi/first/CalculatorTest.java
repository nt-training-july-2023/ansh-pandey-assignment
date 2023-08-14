package com.restapi.first;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.restapi.first.Calculator.sum;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    Calculator calculator;
    @BeforeEach
    void setCalculator(){
        Calculator calculator = new Calculator();
    }
    @Test
    public  void testsum(){
        assertEquals(10,sum(4,6));
    }

}
