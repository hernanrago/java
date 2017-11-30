/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helvault.tests;

import helvault.Calculator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hernan
 */
public class CalculatorTest {
    
    @Before
    public void before(){
        
    }
    
    
 
    Calculator calculator = new Calculator();
    
    @Test
    public void testSuma(){
        
        Integer suma=calculator.operation("+", 5, 2);
        Integer esperado=7;
        assertEquals(esperado, suma);
    }
    
    @Test
    public void testResta(){
        Integer resta=calculator.operation("-", 5,2);
        Integer esperado=3;
        assertEquals(esperado, resta);
    }
    
        @Test
    public void testMultiplicacion(){
        Integer multiplicacion=calculator.operation("*", 5, 2);
        Integer esperado=10;
        assertEquals(esperado, multiplicacion);
    }
    
        @Test
    public void testDivision(){
        Integer division=calculator.operation("/", 6, 2);
        Integer esperado=3;
        assertEquals(esperado, division);
    }
    
}