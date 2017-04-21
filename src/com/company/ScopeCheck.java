package com.company;

/**
 * Created by idejesus on 26/03/2017.
 */
public class ScopeCheck {
    private int privateVar = 1;

    public int getPrivateVar() {
        return privateVar;
    }

    public void timesTwo() {
        int privateVar = 2;
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " times two is " + i * privateVar);
        }

    }

    public class InnerClass {
        //public int privateVar = 3;

        public InnerClass() {
            System.out.println("InnerClass created, privateVar is " + privateVar);
        }

        public void timesTwo() {
//            int privateVar = 4;
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " times two is " + i * ScopeCheck.this.privateVar);
            }
        }

    }
}