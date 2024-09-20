package com.example.task05;

/**
 * Ломаная линия
 */
public class PolygonalLine {
    private Point[] points;
    private double length = 0;
    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    public void setPoints(Point[] points) {
        this.points = points;
        calcLength();
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        if (this.points == null) {
            this.points = new Point[]{point};
            this.length++;
        }
        else{
            Point[] newPoints = new Point[points.length + 1];
            System.arraycopy(points, 0, newPoints, 0, points.length);
            newPoints[newPoints.length - 1] = point;
            setPoints(newPoints);
        }
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        Point point = new Point(x, y);
        addPoint(point);
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        return length;
    }

    private void calcLength(){
        this.length = 0;
        for (int i = 0; i < points.length - 1; i++) {
            this.length += points[i].getLength(points[i + 1]);
        }
    }
}
