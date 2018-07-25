package com.loong.interfaces;

@FunctionalInterface
public interface FunctionalDefaultMethods {
    void method();

    default void defaultMethod() {
        System.out.println("test");
    }

    public static void main(String[] args) {
        FunctionalDefaultMethods functionalDefaultMethods = new FunctionalDefaultMethods() {
            @Override
            public void method() {

            }
        };
        functionalDefaultMethods.defaultMethod();
    }
}
