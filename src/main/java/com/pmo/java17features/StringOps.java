package com.pmo.java17features;

import java.util.stream.Stream;

public class StringOps {

    public static void main(String[] args) {
        System.out.println( " Rev String :"+ revString());
        System.out.println("Reverse using Streams : "+reversedString());
    }

    public static String revString()
    {
        String inputString ="Murali";
        StringBuilder sbString  = new StringBuilder("Hello String builder World !! ");
        StringBuffer bufferString = new StringBuffer("Hello String builder World !! ");

        
        String outputString ="";
        outputString = "Builder String : " + sbString.reverse()  + " + Buffer String :: " + bufferString.reverse();

        return outputString;
    }

    public static String reversedString()
    {
        return Stream.of("Murali").reduce("", (reversed, character) -> character + reversed);

    }
}

