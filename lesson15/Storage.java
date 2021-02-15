package com.alevel.lesson15;

import java.util.ArrayList;
import java.util.List;

public class Storage <T>{
    private List<T> books = new ArrayList<>();

    public void addAll(List<? extends T> list){
        books.add((T) list);
    }

    public static void main(String[] args) {
        Storage<Book> storage = new Storage<>();
        List<Album> albums = new ArrayList<>();
        storage.addAll(albums);
    }
}

