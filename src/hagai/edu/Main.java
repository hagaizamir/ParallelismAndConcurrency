package hagai.edu;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Thread t = new Thread(() -> {

        });
        t.start();

        new Thread(()->{}).start();

        Runnable r = ()-> {};
        r.run();

        Callable<String> c = ()-> "Hello World";

        ArrayList<String> data = new ArrayList<>();
        data.add("A");
        data.add("B");
        data.add("C");
        data.add("D");

        data.forEach();

        Consumer <String> consumer  = (letter)-> {
        };

        data.forEach(s-> System.out.println(s.toLowerCase()));





    }
}
