package org.example;

public class TwoSystem {
    private int x;
    private int y;
    public static final String description = "Описание вектора двумерной системы: ";


    public TwoSystem(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public double lenghtvector() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));

    }

    public double skalvectors(double lenghtvecorOne, double lenghtvecorTwo, int corner) {
        return lenghtvecorOne * lenghtvecorTwo * Math.cos(Math.toRadians(corner));

    }

    public double sumVectors(double lenghtvecorOne, double lenghtvecorTwo) {
        return lenghtvecorOne + lenghtvecorTwo;
    }

    public String razVectors(int x, int y, int x1, int y1) {
        return   "Разность первого вектора " + (x - x1) + "; Разность второго вектора " + (y - y1);
    }
}
