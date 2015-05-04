package org.gradle;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {
    @Test
    public void canConstructAPersonWithAName() {
        Person person = new Person("Larry");
        assertEquals("Larry", person.getName());
    }
    
    @Ignore
    @Test
    public void thisTestFails() {
    	fail(); 
    }
}
