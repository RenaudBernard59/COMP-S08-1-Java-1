/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava.test;

import java.util.HashSet;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author renob
 */
public class SetTest {
    
    @Test
    public void addOK() {
            HashSet<String> set  = new HashSet<>();
            set.add("vert");
            set.add("rouge");
            set.add("vert");
            
            System.out.println(set);
}/*END SetTest*/
    
    
}
