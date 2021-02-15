package com.alevel.lesson15;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listStr = new ArrayList<>();
        Practice1<String> box1 = new Practice1<>(listStr);
        listStr.add("New list");

        System.out.println(listStr.get(0));

        //2
        String[] newArrString = {"dgdg", "dgdgdfg", "dvgdgdg"};
        ClassWithStaticMethod.printNewArray(newArrString);


        Integer[] newar = {1, 5, 8, 6};

        ClassWithStaticMethod.printArr(newar);

        ClassWithStaticMethod.printNewArray(newar);
    }





}
