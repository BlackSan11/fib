package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getNFib(48));
    }
    /**
     * @param nFib - максимальное число до переполнения 47
     */
    private static int getNFib(int nFib) {
        int[] fibs = new int[2];
        fibs[0] = 0;
        fibs[1] = 1;
        int fibRes = 0;
        int buf;
        if(nFib == 1){
            fibRes = 0;
        } else if(nFib == 2){
            fibRes = 1;
        } else{
            for (int i = 2; i < nFib; i++){
                buf = fibs[1];
                fibs[1] = fibs[0] + fibs[1];
                fibs[0] = buf;
            }
            fibRes = fibs[1];
        }
        return fibRes;
    }
}
