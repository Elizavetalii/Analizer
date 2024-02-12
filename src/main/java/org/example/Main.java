package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Добро пожаловать в анализатор треугольников!\n");
        System.out.print("Если вы введете числа, которые не являются сторонами треугольника программа закончится.\n");
        while (true) {

            System.out.print("Число a: ");
            int a;
            try {
                a = scanner.nextInt();//считывает введеное число a
            } catch (InputMismatchException e) {//проверяет, является ли a целым числом
                System.out.println("Ошибка: введенное значение не является целым числом!");
                break;
            }
            System.out.print("Число b: ");
            int b;
            try {
                b = scanner.nextInt();//считывает введеное число b
            } catch (InputMismatchException e) {//проверяет, является ли b целым числом
                System.out.println("Ошибка: введенное значение не является целым числом!");
                break;
            }

            System.out.print("Число c: ");
            int c;
            try {
                c = scanner.nextInt();//считывает введеное число с
            } catch (InputMismatchException e) {//проверяет, является ли c целым числом
                System.out.println("Ошибка: введенное значение не является целым числом!");
                break;
            }

            if (a + b <= c || b + c <= a || c + a <= b) {
                //не могут образовать треугольник по неравенству треугольника
                System.out.println("a, b и c не являются сторонами треугольника");
                break;
            } else if ((a == b && b != c) || (b == c && c != a) || (c == a && a != b)) {
                //образуют треугольник, у которого две стороны равны
                System.out.println("a, b и c являются сторонами равнобедренного треугольника");
            } else if (a == b && b == c) {//образуют треугольник, у которого все стороны равны
                System.out.println("a, b и c являются сторонами равностороннего треугольника");
            } else if (a * a + b * b == c * c || b * b + c * c == a * a || c * c + a * a == b * b) {
                // по теореме Пифагора
                System.out.println("a, b и c являются сторонами прямоугольного треугольника");
            } else {//все остальные случаи
                System.out.println("a, b и c являются сторонами обычного треугольника");
            }
        }
    }
}