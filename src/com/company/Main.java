package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        double[][] vertices =  new double[3][2]; //Creates multidimensional array simulating (x,y) vertex values
        triangle(vertices);
        printVerticesValues(vertices);
        findAndPrintArea(vertices);
    }

    public static double[][] triangle(double[][] vertices){
        for (int i = 0; i < 3; i++) { //iterate through multidimensional array receiving values for x and y
            System.out.println("Input x value of vertex " + i);
            Scanner userReader = new Scanner(System.in);
            vertices[i][0] = Double.parseDouble(userReader.next());
            System.out.println("Input y value of vertex " + i);
            vertices[i][1] = Double.parseDouble(userReader.next());
        }
        return vertices;
    }

    public static void printVerticesValues(double[][] vertices){
        for (int i = 0; i < 3; i++) { //output the (x,y) for each vertex
            for (int j = 0; j < 2; j++) {
                System.out.print(vertices[i][j] + " ");
            }
            System.out.println("\n");
        }
    }

    public static double findAndPrintArea(double[][] vertices){
        double area;
        area = ((vertices[0][0] * (vertices[1][1] - vertices[2][1]) + vertices[1][0] * (vertices[2][1] - vertices[0][1]) + vertices[2][0] * (vertices[0][1] - vertices[1][1])) / 2); //formula to calculate area based on vertices
        if (area < 0){ //Sometimes, area would be calculated as a negative based on which vertices came first, but the area is always positive
            area = area * -1;
        }
        System.out.println(area);
        return area;
    }
}
