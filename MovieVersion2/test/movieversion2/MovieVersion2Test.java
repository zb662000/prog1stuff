/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movieversion2;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Zahra
 */
public class MovieVersion2Test {
    
    public MovieVersion2Test() {
    }

    /**
     * Test of main method, of class MovieVersion2.
     */
    @Test
    public void testMovieCodeWithUnderscore() {
        String movieCode = "i5_ss";
        boolean containsUnderscore = movieCode.contains("_");
        assertEquals(true, containsUnderscore);
    }
    
}
