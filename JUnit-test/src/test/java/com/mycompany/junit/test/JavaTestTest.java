/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.junit.test;

import junit.framework.TestCase;

/**
 *
 * @author techcare
 */
public class JavaTestTest extends TestCase {
    protected  int a , b ;
   
    
    @Override
    protected void setUp() throws Exception {
        a = 3 ;
        b = 3 ;
        
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testSomeMethod() {
        double c = a +b ;
        assertTrue(c == 6);
    }
    
}
