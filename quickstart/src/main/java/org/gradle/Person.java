package org.gradle;

import org.apache.commons.collections.list.GrowthList;
/**
 * Person class.
 */
public class Person {
    private final String name;

    public Person(String name) {
        this.name = name;
        new GrowthList();
    }

    public String getName() {
        return name;
    }
}
