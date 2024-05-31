package com.example.oop;

public class CatManipulating {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.setName ("Alfred");

        Cat myBrownCat = new Cat("Johnny","gray");
       // System.out.println(myBrownCat.getName(), myBrownCat.getColour());
        myCat.sayMiau();
        myBrownCat.sayMiau();
    }

}
