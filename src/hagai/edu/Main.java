package hagai.edu;

import hagai.edu.SheepHerd;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {


//        for (int i = 0; i < 10; i++) {
//            new Thread(() -> {
//            }).start();
//        }
        ExecutorService service = Executors.newSingleThreadExecutor();
        service.execute(()->  System.out.println("Running the task...."));
        System.out.println("Main");
        service.execute(()->  System.out.println("Running the task...."));
         System.out.println("Main");
        service.execute(()->  System.out.println("Running the task...."));
         System.out.println("Main");    
        service.execute(()->  System.out.println("Running the task...."));
         System.out.println("Main");    

        service.shutdown();


    }
   }