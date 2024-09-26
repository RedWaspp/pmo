package com.pmo.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        TestMyPredicate();
    }

    public static void TestMyPredicate() {
        List myList = new ArrayList();
            myList.add("Mary");
            myList.add("John");
            myList.add("Mike");
            myList.add("Peter");
            myList.add("Paul");

        Predicate<List> mySizePrediction = T -> T.size() > 3;
        Predicate<List> myNamePrediction = T -> T.contains("Mary");
        Predicate<String> veluPredicate = name -> name.length() > 3;
        System.out.println(myNamePrediction.or(mySizePrediction).test(myList) );
        System.out.println(myNamePrediction.and(mySizePrediction).test(myList) );
        System.out.println(veluPredicate.test("Murali") );




    }

}
