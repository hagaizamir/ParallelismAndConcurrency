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
        
        ExecutorService threadPool = Executors.newFixedThreadPool(4);
        Future<String> futureResults = threadPool.submit(()->{

           Thread.sleep(1000);
            return "Surprise!";
        })  ;


        System.out.println("Main");
        System.out.println("Main is doing some work");
        System.out.println("Main is now waiting for the future results");
        System.out.println(futureResults.get());
        System.out.println("Main is now waiting for the future results");  


         threadPool.shutdown();


    }

    public static void displayTime() {
        System.out.println(LocalTime.now());
    }

    public static void  doStuff (){
        System.out.println("Doing Stuff");
    }
    public static void  readData(String s){
        System.out.println("Read" + s);

    }
   }