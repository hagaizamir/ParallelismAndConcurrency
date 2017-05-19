 package hagai.edu;
import hagai.edu.SheepHerd;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        SheepHerd herd = new SheepHerd();

        for (int i = 0; i < 10; i++) {
            new Thread(()->herd.addSheepAndCount(), String.valueOf(i)).start();
        }

    }

    final static Object LOCK = new Object();


    public static void doSomeWork() throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        Thread.sleep(1000);

        //Thread safe.
        synchronized (LOCK){
            //atomic unit of execution.
            //increment your counter safely
            System.out.println(Thread.currentThread().getName() + " IS Alone here");
        }

        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName());
    }
}