package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    Point(){
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }

    void flip(){
        int temp = x;
        x = -y;
        y = -temp;
    }

    public String toString(){
        return String.format("(%d, %d)", x, y);
    }

    double distance(Point p) {
        return Math.sqrt(Math.pow((p.x - x), 2) + Math.pow((p.y - y), 2));
    }
}
