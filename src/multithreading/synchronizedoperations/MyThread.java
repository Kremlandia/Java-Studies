/*
 * Copyright (C) 2017 Eduardo
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package multithreading.synchronizedoperations;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eduardo
 */
public class MyThread extends Thread {

    private String threadName;
    private int threadSleepAmount;
    private int[] numbers = {1, 2, 3, 4, 5};
    
    public static SharedCalculator sharedCalculator = new SharedCalculator();
    

    public MyThread(String threadName, int threadSleepAmount) {
        this.threadName = threadName;
        this.threadSleepAmount = threadSleepAmount;
        this.start();
    }

    public void notSyncedOperation() {
        sharedCalculator.add(numbers);
    }

    public synchronized void syncedOperation() {
        sharedCalculator.add(numbers);
    }

    @Override
    public void run() {
        notSyncedOperation();
    }

    public static void main(String[] main) {
        MyThread threadA = new MyThread("Thread #1", 750);
        MyThread threadB = new MyThread("Thread #2", 1000);
    }

}
