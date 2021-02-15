package com.alevel.lesson15;

import java.util.ArrayList;
import java.util.Arrays;

public class ClassWithStaticMethod {
    public static <T> void printArr(T[] array){
        System.out.println(Arrays.toString(array));
    }


    public static <T> T printNewArray(T[] array){
        for (T item: array){
            System.out.println(item);
        }
        return array[0];
    }


}
