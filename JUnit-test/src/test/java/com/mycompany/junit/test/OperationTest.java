/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.junit.test;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

/**
 *
 * @author techcare
 */
public class OperationTest extends TestCase {

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    
   

    /**
     * Test of Cong method, of class Operation.
     */
    
    public void testCong() {
        System.out.println("Cong");
        int a = 3;
        int b = 2;
        Operation instance = new Operation();
        int expResult = 5;
        int result = instance.Cong(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of Tru method, of class Operation.
     */
   
    public void testTru() {
        System.out.println("Tru");
        int a = 6;
        int b = 4;
        Operation instance = new Operation();
        int expResult = 2;
        int result = instance.Tru(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
