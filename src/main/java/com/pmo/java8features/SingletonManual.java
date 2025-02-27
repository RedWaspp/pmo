package com.pmo.java8features;

public class SingletonManual {

    private static SingletonManual myClassinstance;

    private SingletonManual() {
        if(myClassinstance!=null){
            throw new RuntimeException("Use getInstance() to get the single instance of this class :: ");
        }
    }

    public static SingletonManual getInstance(){
        if(myClassinstance == null){myClassinstance = new SingletonManual(); }
        return  myClassinstance;
    }

    public String ShowMyMessage(){
        return "User method here to return any String" ;
    }

    public int sendMeaTen()
    {
        return 10;
    }

    public static void main(String[] args) {
        SingletonManual manual = new SingletonManual();
        System.out.println(manual.ShowMyMessage());
        System.out.println(manual.sendMeaTen());
    }
}
