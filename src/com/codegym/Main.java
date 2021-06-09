package com.codegym;

public class Main {

    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);
        Point2D point2D1 = new Point2D(5.0f, 7.5f);
        System.out.println(point2D1);

        Point3D point3D = new Point3D();
        System.out.println(point3D);
        Point3D point3D1 = new Point3D(7.0f,9.0f,4.0f);
        System.out.println(point3D1);
    }
}
