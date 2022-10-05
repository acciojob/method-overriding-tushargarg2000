package com.driver;

public class Main {

    public static void main(String[] args){

        B obj = new B(); //Creating an object of Class B
        //Call the method of this class

        String ans = obj.meth();

        System.out.println(ans);

        A obj1 = new B();
        System.out.println(obj1.meth());
    }
  
}

