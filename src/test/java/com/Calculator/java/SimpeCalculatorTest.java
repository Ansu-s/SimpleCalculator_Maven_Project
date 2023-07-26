package com.Calculator.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class SimpeCalculatorTest {
    public SimpeCalculator calulatorInstanc;
    @BeforeEach
    public void InstaceSet(){
    calulatorInstanc = new SimpeCalculator();
    }
    @Test
    void add() {

    double result = calulatorInstanc.add(7,4);
        Assertions.assertEquals(11,result);

    }

    @Test
    void subtract() {

        double result = calulatorInstanc.subtract(7,4);
        Assertions.assertEquals(3,result);

    }

    @Test
    void multiply() {
        double result = calulatorInstanc.multiply(7,4);
        Assertions.assertEquals(28,result);

    }
// failed test example
    @Test
    void divide() {
        double result = calulatorInstanc.divide(7,56);
        Assertions.assertEquals(5,result);

    }
}