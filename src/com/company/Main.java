package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getNFib(47));
    }
    /**
     * @param nFib - максимальное число до переполнения 47
     */
    private static int getNFib(int nFib) {
        int[] fibs = new int[nFib+1];
        fibs[0] = 0;
        fibs[1] = 1;
        for (int i = 2; i < nFib; i++) {
            fibs[i] = fibs[i - 1] + fibs[i - 2];
        }
        return fibs[nFib-1];
    }
}
