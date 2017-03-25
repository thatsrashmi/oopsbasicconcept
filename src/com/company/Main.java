package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BaseClass d = null;  //d is a reference of class BaseClass
        d = new DerivedClass(); //reference d of BaseClass is now pointing to instance of DerivedCalss
        d.doSomething();
        if(d instanceof DerivedClass) {
            ((DerivedClass) d).doSomethingNew();
        }
        System.out.println(d.sun(5,7,8));
    }
}
