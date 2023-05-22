package de.aittr;

import jdk.jfr.Name;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class StringToolsTest {
    @Nested
    @DisplayName("Tests for  firstToUpperCase method")
    class firstToUpperCaseTeasts {
        @Test
        @DisplayName(" Check firstToUpperCase with \" apple \" ")
        void firstToUpperCase_apple_Apple() {
            String string1 = "apple";  // arrange
            String actual = StringTools.firstToUpperCase(string1); //action
            String expected = "Apple";
            assertEquals(expected, actual); //assert
        }

        @Test
        @DisplayName(" Check firstToUpperCase with \" Apple \" ")
        void firstToUpperCase_Apple_Apple() {
            String string1 = "Apple";  // arrange
            String actual = StringTools.firstToUpperCase(string1); //action
            String expected = "Apple";
            assertEquals(expected, actual); //assert
        }

    }

    @Nested
    @DisplayName("Check firstToUpperCase method")
class isStartingFromCapitalTests{
    @Test
    @DisplayName("Test isStartingFromCapital with \" apple \"")
    void isStartingFromCapital_apple_false() {
        String string1 = "apple";  // arrange
        boolean actual = StringTools.isStartingFromCapital(string1); //action
        boolean expected = false;
        assertEquals(expected, actual); //assert
    }

        @Test
        @DisplayName("Test isStartingFromCapital with \" Apple \"")
        void isStartingFromCapital_Apple_true() {
            String string1 = "Apple";  // arrange
            boolean actual = StringTools.isStartingFromCapital(string1); //action
            boolean expected = true;
            assertEquals(expected, actual); //assert
        }
}

}