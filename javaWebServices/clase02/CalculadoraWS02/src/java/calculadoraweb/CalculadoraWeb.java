/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraweb;

import java.util.ArrayList;
import javax.jws.WebService;

/**
 *
 * @author educacionit
 */

@WebService
public class CalculadoraWeb {
    
    public Double sumar(ArrayList<Double> numeros){
        Double resultado=0.0;
        for (double numero:numeros)
            resultado+=numero;
        return resultado;
        
    }
        
    public Double restar(ArrayList<Double> numeros){
        Double resultado = numeros.get(0);
        numeros.remove(0);
        for (Double numero: numeros)
            resultado-=numero;
            return resultado;
        
    }
    
    public Double multiplicar(ArrayList<Double> numeros){
        Double resultado = numeros.get(0);
        numeros.remove(0);
        for (Double numero: numeros)
            resultado*=numero;
            return resultado;
    }
    
    
    public Double dividir(ArrayList<Double> numeros){
        Double resultado = numeros.get(0);
        numeros.remove(0);
        try{
            for (Double numero: numeros)
            resultado/=numero;
        } catch (ArithmeticException e){
            resultado=0.0;
        }
        return resultado;
    }
    
    public Double potenciar(ArrayList<Double> numeros, Integer exponente){
        Double resultado = numeros.get(0);
        numeros.remove(0);
        try{
            for (int i=0;i<exponente;i++)
            resultado*=resultado;
        } catch (ArithmeticException e){
            resultado=0.0;
        }
        return resultado;
    }
    
    public Double potenciar2(Double numero, Integer exponente){
        Double resultado=Math.pow(numero, exponente);
        
        return resultado;
    }
    
}
