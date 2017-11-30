/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helvault;

import javax.jws.WebService;

/**
 *
 * @author hernan
 */

@WebService
public class Calculator {
    
    public Integer operation (String operator, Integer... values){
        
        Integer output=values[0];
        
        for (int i = 1; i < values.length; i++) {
        
            switch(operator){
                case "+": output+=values[i];
                    break;
                case "-": output-=values[i];
                    break;
                case "*": output*=values[i];
                    break;
                case "/": output/=values[i];
                    break;
                default: System.out.println("Bad operator selected.");
        
            }

        }
 
        return output;              
    }
    
}
