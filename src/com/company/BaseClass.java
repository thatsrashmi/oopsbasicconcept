package com.company;

/**
 * Created by RASHMI on 25-03-2017.
 */
public class BaseClass {
    private String name;
    public void doSomething(){
        System.out.println(" base class do something");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * first form
     * @param a
     * @param b
     * @return
     */
    public  int sun(int a,int b){
        return  sun(a,b,0);
    }

    public  int sun(int a,int b,int c){
        return  a+b+c;
    }
}
