/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.junit.test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 *
 * @author techcare
 */
public class JunitTestSuite {
    
    @Test
    public void whenAssertingConditions_thenVerifield(){
        assertTrue(10 > 5 , "10 lớn hơn 5");
    }
    
    @Test
    public void whenAssertingConditions_thenVerified() {
    assertTrue(5 > 10, "5 không lớn hơn 10");
    }
}
