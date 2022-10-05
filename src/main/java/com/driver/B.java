package com.driver;

public class B extends A{

    public String meth(){

        A a = new A();
        String ans = a.meth();

        System.out.println(ans);
        return "Method is overridden in Extendend class B";
    }
}
