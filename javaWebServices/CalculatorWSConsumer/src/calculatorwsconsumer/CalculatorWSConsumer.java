/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorwsconsumer;

import helvault.Calculator;
import helvault.CalculatorService;
import java.util.ArrayList;

/**
 *
 * @author hernan
 */
public class CalculatorWSConsumer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CalculatorService calculatorService = new CalculatorService();
        Calculator calculator = calculatorService.getCalculatorPort();
        ArrayList arrayList = new ArrayList();
        arrayList.add(50);
        arrayList.add(2);
        arrayList.add(5);
        Integer output=calculator.operation("/", arrayList);
        System.out.println(output);
        
    }
    
}
