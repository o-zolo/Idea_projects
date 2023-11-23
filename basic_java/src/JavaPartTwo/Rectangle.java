package JavaPartTwo;

import static java.lang.Math.sqrt;

public class Rectangle {
    private double width;
    private double height;
    private double angle = 90;

    public Rectangle() {

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    public Rectangle(double width, double height, double angle) {
        this.width = width;
        this.height = height;
        this.angle = angle;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void calculateArea(double width, double height) {
        double square = width * height;
        System.out.println("Square = " + square);
    }

    public void calculatePerimeter(double width, double height) {
        double perimeter = 2 * (width + height);
        System.out.println("Perimeter = " + perimeter);
    }

    public void getDiagonal(double width, double height) {
        double diagonal = sqrt(width * width + height * height);
        System.out.println("Diagonal = " + diagonal);
    }
}