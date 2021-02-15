package com.alevel.lesson15;

import java.util.Arrays;

public class Packer {
    public static void main(String[] args) {
        Packer packer = new Packer();
        Box<Food> foodBox = new Box<>();
        Box<Bakery>  bakeryBox = new Box<>();
        Box<Cake> cakeBox = new Box<>();
        packer.repackage(bakeryBox,cakeBox);
        packer.repackage(foodBox, cakeBox);
        Box<Pie> pieBox = new Box<>();
        pieBox.put(new Pie("Cherry"));
        pieBox.put(new Pie("Chocolate"));

        packer.repackage(foodBox, pieBox);

        System.out.println(foodBox.get(1));


    }

    public <T> void repackage(Box<? super T> BoxTo, Box<? extends T> from) {

        BoxTo.put(from.get(0));
    }

}

class Box<T> {

    private T item;

    public void put(T item) {
        this.item = item;
    }

    public T get(int i) {
        return this.item;
    }
}

class Goods {
}

class Food extends Goods {
}

class Bakery extends Food {
}

class Cake extends Bakery {
}

class Pie extends Bakery {
    Pie(String Taste) {

    }
}

class Tart extends Bakery {
}


