package hagai.edu;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SheepHerd herd = new SheepHerd();
        for (int i = 0; i <10 ; i++) {
            new Thread(()->herd.addSheepAndCount(),String.valueOf(i)).start();

        }

//        //will make the main tread sleep
//        //Thread.sleep(1000);
//
//        //favour encapsulation over inheritance
//
//        Thread t = new Thread(() -> {
//
//            while (true){
//                System.out.println("Hello");
//                //will make the 2nd thread sleep
//                try {
//                    Thread.sleep(5000);//don't use the cpu
//                } catch (InterruptedException e) {
//                    //get rid of any resources and make the tread stop
//                    //clean up
//                    e.printStackTrace();
//                }
//            }
//
//        });
//        t.start();
//
//      //  t.interrupt();
//
//
//
//

    }
}
