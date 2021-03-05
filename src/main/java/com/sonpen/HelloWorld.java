package com.sonpen;

/**
 * Created by 1109806 on 2020/11/25.
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello Java");

        HelloWorld helloWorld = new HelloWorld();
        int result = helloWorld.solution(new int[] {1,2,3,2,1});

        System.out.println(result);
    }

    private int solution(int[] ints) {
        int result = 0;
        for (int i = 0; i < ints.length; i++) {
            result ^= ints[i];
        }
        return result;
    }

}
