package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(3.0, 2.0);
        ComplexNumber c2 = new ComplexNumber(28.0, 2.0);

        ComplexNumber cSum = c1.add(c2);
        ComplexNumber cMulti = c1.multiply(c2);

        System.out.println("Первое число: " + c1.toString());
        System.out.println("Второе число: " + c2.toString());
        System.out.println("Сумма: " + cSum.toString());
        System.out.println("Произведение: " + cMulti.toString());
    }
}
