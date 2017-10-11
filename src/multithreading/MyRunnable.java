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
package multithreading;

/**
 *
 * @author Eduardo
 */
public class MyRunnable implements Runnable {

    private String threadName;
    private int threadSleepAmount;

    public MyRunnable(String threadName, int threadSleepAmount) {
        this.threadName = threadName;
        this.threadSleepAmount = threadSleepAmount;
        new Thread(this).start();
    }

    @Override
    public void run() {
        increment(5);
    }

    public void increment(int times) {
        for (int counter = 0; counter <= times; counter++) {
            System.out.println(threadName + " counting " + counter);
            try {
                Thread.sleep(threadSleepAmount);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
