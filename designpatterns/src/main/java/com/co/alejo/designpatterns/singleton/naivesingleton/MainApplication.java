package com.co.alejo.designpatterns.singleton.naivesingleton;

public class MainApplication {

    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused" + "\n" +
                "If you see different values, then 2 singletons were created" + "\n\n" +
                "RESULT:" + "\n");
        Singleton singleton = Singleton.getInstance("The same singleton");
        Singleton anotherSingleton = Singleton.getInstance("Different singleton");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}
