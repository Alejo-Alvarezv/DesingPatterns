package com.co.alejo.designpatterns.singleton.naivesingleton2;

public class MainApplication {

    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused" + "\n" +
                "If you see different values, then 2 singletons were created" + "\n\n" +
                "RESULT:" + "\n");
        Thread threadSingleton1 = new Thread(new ThreadSingleton1());
        Thread threadSingleton2 = new Thread(new ThreadSingleton2());
        threadSingleton1.start();
        threadSingleton2.start();
    }

    static class ThreadSingleton1 implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("Singleton 1");
            System.out.println(singleton.value);
        }
    }

    static class ThreadSingleton2 implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("Singleton 2");
            System.out.println(singleton.value);
        }
    }
}
