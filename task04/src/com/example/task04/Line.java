package com.example.task04;

public class Line {
    private Point p1;
    private Point p2;

    Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() {return p1;}
    public Point getP2() {return p2;}

    public String toString() {
        return p1.toString() + "-" + p2.toString();
    }

    public boolean isCollinearLine(Point p) {
        int vecAx = this.p1.x - this.p2.x;
        int vecAy = this.p1.y - this.p2.y;
        int vecBx = this.p1.x - p.x;
        int vecBy = this.p1.y - p.y;

        double skewProduct = vecAx * vecBy - vecBx * vecAy;
        return skewProduct == 0;
    }
}
