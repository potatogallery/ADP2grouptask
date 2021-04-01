/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author*********Keallan Saunders 219169357*************************
 */
package za.ac.cput.imtired;

import java.time.Duration;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Assertions;
import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author*********Keallan Saunders 219169357*************************
 */

public class DivisionTest {
    
    public Division division1;
    public Division division2;
    public Division division3;
    

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    division1 = new Division();
    division2 = new Division();
    division3 = new Division();
    division3 = division1;
    }
    
    @Test
    public void testIdentity(){
        Assertions.assertSame(division1,division3);
    }
    @Test
    public void testEquality(){
        Assertions.assertEquals(division1,division3);  
    }
    @Test
    public void testFailing(){
        Assertions.assertTrue(false);
        System.out.println("Mybruu did it work");
    }
    @Test
    @Timeout(4)
    public void timeouttest() throws InterruptedException {
            Thread.sleep(3500);
        System.out.println("Test Passed within Time");
}

    @Test
    @Disabled
    public void testDisable(){
        System.out.println("This test is DISABLE!");
    }
    
    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }
    
    
    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
}
