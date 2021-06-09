package com.codegym;

public class Point3D extends Point2D {
    float z = 0.0f;

    public Point3D() {

    }

    public Point3D(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float getZ() {
        return this.z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{this.x, this.y, this.z};
    }

    public void setXYZ(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String toString() {
        return "(" + super.getX() + ", " + super.getY() + ", " + this.getZ() + ")";
    }
}
