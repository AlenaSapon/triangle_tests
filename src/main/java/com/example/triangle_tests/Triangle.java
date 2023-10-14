package com.example.triangle_tests;

import java.io.*;
import java.util.Scanner;

public class Triangle {

    boolean checkIfTriangle(Integer a, Integer b, Integer c) {
        boolean triangleExist = false;
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("The sides of the triangle must be greater 0.");
        }
        else if (a + b < c && a + c < b && b + c < a) {
            System.out.println("Triangle doesn't exist.");
        } else {
            System.out.println("Triangle exists.");
            triangleExist = true;
        }
        return triangleExist;
    }

    static void checkTriangleType(int a, int b, int c) {
        if (a == b || a == c || b == c) {
            if (a == b && a == c) {
                System.out.println("Triangle is Equilateral.");
            } else {
                System.out.println("Triangle is Isosceles.");
            }
        } else {
            System.out.println("Triangle is Scalene.");
        }
    }
}
