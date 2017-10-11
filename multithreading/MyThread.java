package technology.studies.chapternine.multithreading;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Eduardo
 */
public class MyThread extends Thread {

    private String threadName;
    private int threadSleepValue;

    public MyThread(String threadName, int threadSleepValue) {
        this.threadName = threadName;
        this.threadSleepValue = threadSleepValue;
        this.start();
    }

    @Override
    public void run() {
        System.out.println(threadName + " has started your execution.");
        try {
            for (int i = 0; i <= 10; i++) {
                System.out.println(threadName + " counting " + i);
                Thread.sleep(threadSleepValue);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(threadName + " has finalized your execution.");
    }
}

class ThreadTest {

    public static void main(String[] args) {
        MyThread threadA = new MyThread("Thread #1", 1000);
        MyThread threadB = new MyThread("Thread #2", 750);
        MyThread threadC = new MyThread("Thread #3", 500);
    }

}
