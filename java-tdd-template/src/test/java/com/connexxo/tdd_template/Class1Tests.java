package com.connexxo.tdd_template;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Class1Tests {

    @Test void FailingTest() {
        Class1 underTest = new Class1();
        assertTrue(false, "I'm a failing test!");
    }

    @Test void PassingTest() {
        assertTrue(true, "I'm a passing test!");
    }
}
