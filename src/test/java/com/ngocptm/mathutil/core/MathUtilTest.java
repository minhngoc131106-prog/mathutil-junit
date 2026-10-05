/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.ngocptm.mathutil.core;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 *
 * @author legion
 */
public class MathUtilTest {
    
   @Test
    void testGetFactorialGivenRightArgumentReturnsWell() {
        assertEquals(1, MathUtil.getFactorial(0));
        assertEquals(1, MathUtil.getFactorial(1));
        assertEquals(120, MathUtil.getFactorial(5));
    }
    @Test
    void testGetFactorialGivenWrongArgumentThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> MathUtil.getFactorial(-5));
        assertThrows(IllegalArgumentException.class, () -> MathUtil.getFactorial(21));
    }
    // Kĩ thuật DDT (Data-Driven Testing) với @ParameterizedTest
    @ParameterizedTest
    @CsvSource({
        "0, 1",
        "1, 1",
        "2, 2",
        "3, 6",
        "4, 24",
        "5, 120",
        "6, 720"
    })
    void testGetFactorialGivenRightArgumentReturnsWellDDT(int input, long expected) {
        assertEquals(expected, MathUtil.getFactorial(input));
    }
}
