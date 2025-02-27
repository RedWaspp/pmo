package com.pmo.java8features;


@FunctionalInterface
interface MyInterface {

//
//    void abstractMethod();

    default void defaultMethod() {
        System.out.println("Default method implementation");
    }

    int ops(int a, int b);

}

class MyClass implements MyInterface {
    @Override
    public int ops(int a, int b){
        return a*b;
    }
}

public class functionTest  {
    public static void main(String[] args) {
        MyInterface m = (a,b) -> a*b;


        MyClass myObject = new MyClass();
//        myObject.abstractMethod();
        myObject.defaultMethod();
        System.out.println("ops :"+ m.ops(10,5));
    }
}
