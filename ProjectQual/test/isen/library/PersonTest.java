package isen.library;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void testDefaultConstructor() {
        Person person = new Person();
        assertEquals("unknown", person.getName());
        assertEquals(22, person.getYears());
    }

    @Test
    void testSetName() {
        Person person = new Person();
        person.setName("John");
        assertEquals("John", person.getName());
    }

    @Test
    void testSetYears() {
        Person person = new Person();
        person.setYears(30);
        assertEquals(30, person.getYears());
    }
}