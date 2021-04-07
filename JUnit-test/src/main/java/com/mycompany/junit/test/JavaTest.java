/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.junit.test;

import junit.framework.Assert;

/**
 *
 * @author techcare
 */
public class JavaTest {
    protected  int a ; 
    protected  int b ;
    
    protected void setUp(){
        a = 1 ; 
        b =2 ; 
        
    }
    public void testAdd(){
        double result = a + b ;
        Assert.assertTrue(result == 3);
        
    }
}
