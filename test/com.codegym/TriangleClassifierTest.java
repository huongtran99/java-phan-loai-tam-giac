package com.codegym;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class TriangleClassifierTest {

    @Test
    @DisplayName("Testing 2, 2, 2")
    public void testcase1()  {
        TriangleClassifier t = new TriangleClassifier(2, 2, 2);
        int expected = 2;
        int actual = t.CheckTriangle();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Testing 2, 2, 3")
    public void testcase2()  {
        TriangleClassifier t = new TriangleClassifier(2, 2, 3);
        int expected = 1;
        int actual = t.CheckTriangle();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Testing 3, 4, 5")
    public void testcase3()  {
        TriangleClassifier t = new TriangleClassifier(3, 4, 5);
        int expected = 0;
        int actual = t.CheckTriangle();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Testing 8, 2, 3")
    public void testcase4()  {
        TriangleClassifier t = new TriangleClassifier(8, 2, 3);
        int expected = -1;
        int actual = t.CheckTriangle();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Testing -1, 2, 1")
    public void testcase5()  {
        TriangleClassifier t = new TriangleClassifier(-1, 2, 1);
        int expected = -1;
        int actual = t.CheckTriangle();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Testing 0, 1, 1")
    public void testcase6()  {
        TriangleClassifier t = new TriangleClassifier(0, 1, 1);
        int expected = -1;
        int actual = t.CheckTriangle();
        assertEquals(expected, actual);
    }
}

