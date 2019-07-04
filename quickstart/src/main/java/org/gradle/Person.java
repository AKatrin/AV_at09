package org.gradle;

import org.apache.commons.collections.list.GrowthList;
/**
 * Person class.
 */
public class Person {
    /**
     * Variable for the name person.
     */
    private String name;

    /**
     * Constructor of person sending the name.
     */
    public Person(final String name) {
        this.name = name;
        new GrowthList();
    }

    /**
     * Return the name person.
     */
    public String getName() {
        return name;
    }
}
