/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.junit.test;

/**
 *
 * @author techcare
 */
public class MathUtil {
    private MathUtil(){
        throw new UnsupportedOperationException("Cannot call constructor directly");
    }
    
    public static int devide (int dividend , int divisor ){
        if(divisor ==0){
            throw  new IllegalArgumentException("So chia la 0");
        }
        return dividend/divisor ;
                
    }
    public static int add (int a , int b ){
        return a - b ; 
    }
}
