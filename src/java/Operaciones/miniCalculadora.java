/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

/**
 * Esta clase es un ejemplo de calculadora y como documentar en Javadoc
 * @author Julian
 */
public class miniCalculadora {
    
    /**
     * Metodo que devuelve el valor absoluto de un numero
     * @param n Numero al que se le va a calcular el valor absoluto
     * @return Resultado
     */
    public double valorAbsoluto(double n){
        double m = Math.abs(n);
        return m;
    }
    
    /**
     * Metodo que devuelve la raiz cuadrada de un numero
     * @param n Numero al que se le va a realizar la raiz cuadrada
     * @return Resultado
     */
    public double raizCuadrada(double n){
        double m = Math.sqrt(n);
        return m;
    }
}
