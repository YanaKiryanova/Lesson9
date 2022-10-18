package org.example;

public class ThreeSystem {
    private int x;
    private int y;
    private int z;
    public static final String description = "Описание вектора трехмерной системы: ";

    public ThreeSystem(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;

    }

    public double lenghtvector() {
        double vector = Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2) + Math.pow(this.z, 2));
        return vector;
    }

    public double skalvectors(int x, int y, int z, int x1, int y1, int z1, int x2, int y2, int z2) {
        return (x * y1 * z2) + (y * z1 * x2) + (z * x1 * y2) - (z * y1 * x2) - (y * x1 * z2) - (x * z1 * y2);
    }

    public double sumVectors(double lenghtvecorOne, double lenghtvecorTwo, double lenghtvecorThree) {
        return (lenghtvecorOne + lenghtvecorTwo) + lenghtvecorThree;
    }

    public String razVectors(int x, int y, int z, int x1, int y1, int z1, int x2, int y2, int z2) {
        return "Разность первого вектора " + (x - x1 - x2) + "; Разность первого вектора " + (y - y1 - y2) + "; Разность первого вектора " + (z - z1 - z2);
    }
}
