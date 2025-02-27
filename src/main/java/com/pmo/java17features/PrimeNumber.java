package com.pmo.java17features;

public class PrimeNumber {
    public static void main(String[] args) {
//        System.out.println(isOddOrEven(101));
        System.out.println("Prime or not : "+isPrimeOrNot(97));
    }

    public static String isOddOrEven(int givenInput)
    {
        String output = "";
        if(givenInput %2 ==0 )
        {
            output = "Even number";

        }
          else { output = "Odd number"; }
    return output;
    }

    public static String isPrimeOrNot(int givenInput){
        String output ="";

        for(int i=2 ; i<= Math.sqrt(givenInput) ; i++)
        {
            if( givenInput / i ==0){
                output =  givenInput + " is not Prime";
            }
            else
                output =  givenInput + " is Prime number";
        }


        return output;
    }
}
