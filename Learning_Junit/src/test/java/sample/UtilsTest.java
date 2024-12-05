/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package sample;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 *
 * @author remib
 */
public class UtilsTest {
    
    public UtilsTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of concatWords method, of class Utils.
     */
    @Test
    public void testConcatWords() {
        System.out.println("concatWords");
        assertEquals("Hello, world!", Utils.concatWords(new String[]{"Hello", ", ", "world", "!"}));
    }

    /**
     * Test of computeFactorial method, of class Utils.
     */
    @Test
    @Timeout(value = 10, unit = TimeUnit.NANOSECONDS)
    @RepeatedTest(10)
    public void testComputeFactorial() {
        System.out.println("computeFactorial");
        final int factorialOf = 1 + (int) (30000 * Math.random());
        System.out.println("computing " + factorialOf + "!");
        System.out.println(factorialOf + "! = " + Utils.computeFactorial(factorialOf));
    }
    
    @Test
    //@Disabled
    public void checkExpectedException() {
        System.out.println("checkExpectedException");
        final int factorialOf = -5;
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                //code under test for throwing IllegalArgumentException
        System.out.println(factorialOf + "! = " + Utils.computeFactorial(factorialOf)));
    }
    
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void testWithValueSource(int argument) {
            assertTrue(argument > 0 && argument < 4);
    }

}
