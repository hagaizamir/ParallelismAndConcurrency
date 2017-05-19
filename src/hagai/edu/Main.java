package hagai.edu;

import hagai.edu.SheepHerd;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.concurrent.*;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        
        SheepHerd herd = new SheepHerd();
        ExecutorService pool = Executors.newFixedThreadPool(4)  ;
        pool.execute(herd::addSheepAndCount);

       ScheduledExecutorService sched =  Executors.newScheduledThreadPool(1)    ;
       sched.scheduleAtFixedRate(()->{
           System.out.println(LocalTime.now());

           },1,3,TimeUnit.SECONDS);
       pool.execute(herd::addSheepAndCount);
      


        ArrayList<String> data = new ArrayList<>();
        data.add("A");
        data.add("B");
        data.add("C");
        data.add("D");

        data.forEach(Main::readData)  ;


        ExecutorService service = Executors.newFixedThreadPool(4);
        service.execute(Main::doStuff);

        service.shutdown();


    }
    public static void  doStuff (){
        System.out.println("Doing Stuff");
    }
    public static void  readData(String s){
        System.out.println("Read" + s);

    }
   }