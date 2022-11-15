package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape{
    private final static String name = "Circle";
    private double R;

    public Circle(double R) {
        this.R = R;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.R, R) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(R);
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return 3.14 * R * R;
    }
}