package hagai.edu;

import hagai.edu.SheepHerd;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.concurrent.*;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //consumer
        //shutdown


//        Consumer<String> callback = (s)->{
//            System.out.println("The result is here: ");
//            System.out.println(s);
//        };
//
        doStuff((s)->{
            System.out.println("The result is here: ");
            System.out.println(s);
        });



    }

    public static void doStuff(Consumer<String> listener){
        ExecutorService threadPool = Executors.newFixedThreadPool(4);

        threadPool.submit(()->{
            try {Thread.sleep(4000);}
            catch (InterruptedException ignored) {}
            //doing some work
            //call the listener
            listener.accept("this is the result");
        });

        threadPool.shutdown();
    }
    public static void doStuff(){
        System.out.println("Doing stuff.");
    }
    //void accept(T result)
    public static void readData(String s){
        System.out.println("Read " + s);
    }
    public static void displayTime(){
        System.out.println(LocalTime.now());
    }
}