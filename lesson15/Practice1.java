package com.alevel.lesson15;

import java.util.List;

public class Practice1<T> {
    private List<T> list;

    public Practice1(List<T> list) {
        this.list = list;
    }

    public T get(int i){
        return list.get(i);
    }

    public void add(T value){
        list.add(value);
    }


}
