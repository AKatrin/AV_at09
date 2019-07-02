package org.gradle;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Person test class.
 */
public class PersonTest {
    @Test
    public void canConstructAPersonWithAName() {
        Person person = new Person("Larry");
        assertEquals("Larry", person.getName());
    }
}
