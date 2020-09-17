package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {


    @Test
    void allVerticesAtOnePoint() {
        Main newMain = new Main();
        double[][] vertices = {{0,0},{0,0},{0,0}};
        double area = newMain.findAndPrintArea(vertices);
        assertEquals(0, area);
    }

    @Test
    void verticesInALine() {
        Main newMain = new Main();
        double[][] vertices = {{0,1},{2,3},{3,4}};
        double area = newMain.findAndPrintArea(vertices);
        assertEquals(0,area);
    }

    @Test
    void simpleArea() {
        Main newMain = new Main();
        double[][] vertices = {{0,0},{0,10},{10,0}};
        double area = newMain.findAndPrintArea(vertices);
        assertEquals(50,area);
    }

    @Test
    void lineAcrossHorizontalAxis() {
        Main newMain = new Main();
        double[][] vertices = {{0,0},{0,10},{0,50}};
        double area = newMain.findAndPrintArea(vertices);
        assertEquals(0,area);
    }

    @Test
    void simpleNegativeArea() {
        Main newMain = new Main();
        double[][] vertices = {{-10,-10},{-10,0},{-5,-5}};
        double area = newMain.findAndPrintArea(vertices);
        assertEquals(25,area);
    }

    @Test
    void simpleDecimalArea() {
        Main newMain = new Main();
        double[][] vertices = {{0,0},{2.5,0},{0,5}};
        double area = newMain.findAndPrintArea(vertices);
        assertEquals(6.25,area);
    }
}