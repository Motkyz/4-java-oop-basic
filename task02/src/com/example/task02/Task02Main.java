package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan time1 = new TimeSpan(2,25,15);
        TimeSpan time2 = new TimeSpan(5,35,50);
        TimeSpan time3 = new TimeSpan(10,35,70);
        TimeSpan time4 = new TimeSpan(15,85,350);

        System.out.println("Время1 (до сложения) - " + time1.toString());
        time1.add(time2);
        System.out.println("Время1 (после сложения) - " + time1.toString());
        System.out.println("Время2 - " + time2.toString());

        System.out.println("Время3 - " + time3.toString());
        System.out.println("Время4 (до вычитания) - " + time4.toString());
        time4.subtract(time3);
        System.out.println("Время4 (после вычитания) - " + time4.toString());
    }
}
