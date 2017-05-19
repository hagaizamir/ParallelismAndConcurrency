package hagai.edu;

/**
 * Created by Hagai Zamir on 19-May-17.
 */
public class SheepHerd {
    private int sheepCounter = 0;


    public synchronized void  addSheepAndCount (){
        System.out.print(++sheepCounter+"Thread ");
        System.out.println(Thread.currentThread().getName());
    }
    public void  addSheepAndCountExplicit () {
        synchronized (this) {
        }
        System.out.print(++sheepCounter + "Thread ");
        System.out.println(Thread.currentThread().getName());
    }
}
