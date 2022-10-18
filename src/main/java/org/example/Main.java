package org.example;

public class Main {
    public static void main(String[] args) {
        int [] ar =  nVector(2);
        TwoSystem twoSystem1 = new TwoSystem(ar[0], ar[1]);
        int [] ar2 = nVector(2);
        TwoSystem twoSystem2 = new TwoSystem(ar2[0], ar2[1]);

        System.out.println(TwoSystem.description +"\n" + "Длина первого вектра = " +twoSystem1.lenghtvector() +"\n"+
                          "Длина второго вектра = " + twoSystem2.lenghtvector() + "\n" + "Cкалярное произведение " +
                           twoSystem1.skalvectors(twoSystem1.lenghtvector(), twoSystem2.lenghtvector(), 60) + "\n" +
                          "Сложение векторов = " + twoSystem1.sumVectors(twoSystem1.lenghtvector(), twoSystem2.lenghtvector()));
        System.out.println("Разность векторов = " + twoSystem1.razVectors(ar[0], ar[1], ar2[0], ar2 [1]));
        System.out.println("-------------------------------------------------------");

        int [] arr = nVector(3);
        ThreeSystem threeSystem1 = new ThreeSystem(arr[0], arr[1], arr[2]);
        int [] arr2 = nVector(3);
        ThreeSystem threeSystem2 = new ThreeSystem(arr2[0], arr2[1], arr2[2]);
        int [] arr3 = nVector(3);
        ThreeSystem threeSystem3 = new ThreeSystem(arr3[0], arr3[1], arr3[2]);

        System.out.println(ThreeSystem.description + "\n" + "Длина первого вектра = " + threeSystem1.lenghtvector() + "\n" +
                "Длина второго вектра = "  + threeSystem2.lenghtvector() + "\n" + "Длина третьего вектра = " + threeSystem3.lenghtvector());
        System.out.println("Cкалярное произведение = " + threeSystem1.skalvectors(arr[0], arr[1], arr[2],arr2[0], arr2[1], arr2[2],arr3[0], arr3[1], arr3[2]));
        System.out.println( "Сложение векторов = " + threeSystem1.sumVectors(threeSystem1.lenghtvector(), threeSystem2.lenghtvector(), threeSystem3.lenghtvector()));
        System.out.println("Разность векторов = " + threeSystem1.razVectors(arr[0], arr[1], arr[2],arr2[0], arr2[1], arr2[2],arr3[0], arr3[1], arr3[2]));
    }

    private static int[] nVector(int n) {
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 11);
        }
        return vector;
    }
}