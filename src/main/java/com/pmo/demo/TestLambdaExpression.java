package com.pmo.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

@FunctionalInterface
interface DemoInterface {
    public void display();
}

@FunctionalInterface
interface myLargestCalculationInterface {
    public Integer largest();
}



interface veluInterfaceWithParameters {
    public Integer calculateMe(int a, int b);
}

public class TestLambdaExpression {

    // main method
    public static void main(String[] args) {



        List<String> myList = new ArrayList();
        myList.add("Hello");
        myList.add("World");
        myList.add("Lambda");
        myList.add("Expression");
        myList.add("Demo");
        myList.add("Java");
        myList.forEach( v -> System.out.println("first iteration :"+v));
        System.out.println("======");
        myList.forEach( System.out::println);
        System.out.println("======");



        // Lambda Expression equivalent for above method
        DemoInterface d = () -> System.out.println("Hello World");
        Integer[] numbers = {56, 27, 128, 465, 8565};

           myLargestCalculationInterface d3 = null ;
        d3.largest();



        myLargestCalculationInterface d1 = () -> {

            Integer largest = Arrays.stream(numbers)
                    .reduce(Integer::max)
                    .orElse(null);
            return largest;
        };

        // how to invoke Lambda Expression -> Functional Interface
        d.display();
        Velu();
    }



    public static void Velu() {

        veluInterfaceWithParameters veluReferrence = (a,b) -> {
        int  c=a+b;
            return c ;
        };
        System.out.println(veluReferrence.calculateMe(10,20));



    }

}