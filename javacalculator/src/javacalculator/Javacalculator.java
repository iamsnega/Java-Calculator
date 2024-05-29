/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javacalculator;
import java.util.Scanner;

public class Javacalculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("***BASIC CALCULATOR***");
            while (true) {
                System.out.println("CHOOSE AN OPERATION:");
                System.out.println("1. ADDITION");
                System.out.println("2. SUBTRACTION");
                System.out.println("3. MULTIPLICATION");
                System.out.println("4. DIVISION");
                System.out.println("5. EXIT");
                char op = sc.next().charAt(0);
                if (op == '5') {
                    System.out.println("EXITING...");
                    break;
                }
                double num1, num2;
                System.out.println("ENTER THE FIRST NUMBER:");
                num1 = sc.nextDouble();
                System.out.println("ENTER THE SECOND NUMBER:");
                num2 = sc.nextDouble();
                double result = 0;
                switch (op) {
                    case '1':
                        result = num1 + num2;
                        break;
                    case '2':
                        result = num1 - num2;
                        break;
                    case '3':
                        result = num1 * num2;
                        break;
                    case '4':
                        if (num2 == 0) {
                            System.out.println("CAN'T DIVIDE BY ZERO");
                            continue;
                        } else {
                            result = num1 / num2;
                        }
                        break;
                    default:
                        System.out.println("INVALID CHOICE! PLEASE PROVIDE A VALID INPUT!!!");
                        continue;
                }
                System.out.println("THE FINAL OUTPUT: " + result);
            }
        }
    }
}

