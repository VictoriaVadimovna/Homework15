package com.alevel.lesson15;

import java.util.ArrayList;
import java.util.List;

public class BookService {
    public static void copyToBooks(List<? extends Book> src, List<Book> desk){
        for (Book book : src){
            desk.add(book);
        }
    }

public static <T extends Book> void copyToBooks1(List<? extends T> src, List<? super T> dest){
        for (T book : src){
            dest.add(book);
        }
}




    public static void main(String[] args) {
        List<Album> booksSource = new ArrayList<>();
        List<Book> booksDestination = new ArrayList<>();
        copyToBooks(booksSource, booksDestination);

        //2

        List<Album> albumSource = new ArrayList<>();
        List<Album> albumDestination = new ArrayList<>();
        List<Book> bookDestination = new ArrayList<>();
        copyToBooks1(albumSource, albumDestination);
        copyToBooks1(albumSource, bookDestination);

    }

}
