package ua.goit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SumCalculatorTest {

    private SumCalculator sumCalculator;

    @BeforeEach
    @DisplayName("Create sumCalculator test methods")
    void setUp() {
        SumCalculator sumCalculator = new SumCalculator();
    }

    @Test
    @DisplayName("test Sum with positive input")
    void testSumWithPositiveInput() {
        assertEquals(1, sumCalculator.sum(1));
        assertEquals(6, sumCalculator.sum(3));
        assertEquals(15, sumCalculator.sum(5));
    }

    @Test
    @DisplayName("test Sum with zero input")
    void testSumWithZeroInput() {
        assertEquals(0, sumCalculator.sum(0));
    }

    @Test
    @DisplayName("test Sum with negative input")
    void testSumWithNegativeInput() {
        assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(-1));
    }
}