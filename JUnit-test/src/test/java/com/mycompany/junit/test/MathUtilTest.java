/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.junit.test;


import junit.framework.Assert;
import org.junit.jupiter.api.Test;


/**
 *
 * @author techcare
 */

public class MathUtilTest {
    
    @Test
    public void divide_SixDividedByTwo_returnThree(){
        final int expected =3 ;
        final int actual =MathUtil.devide(6, 2);
        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void divide_OneDivisorByTwo_ReturnZero(){
         final int expected =3 ;
         final int actual =MathUtil.devide(1, 2);
         Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void add_SixAddedByTwo_ReturnEight(){
        final int expected = 10;
        final int actuar = MathUtil.add(6, 4);
        Assert.assertEquals(expected, actuar);
    }
}
