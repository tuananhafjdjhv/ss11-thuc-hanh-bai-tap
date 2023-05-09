package com.example.ss11thbaitap;
import java.util.Scanner;
public class PhuongTrinhBac2 {
        public void QuadraticEquationSolve() {
            double a,b,c;
            double delta = b * b - 4 * a * c;

            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Phương trình có nghiệm kép: x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phương trình có hai nghiệm: x1 = " + x1 + ", x2 = " + x2);
            }
        }
    }

