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
package create.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Eduardo
 */
public class MainClass {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();

        MyThread threadA = new MyThread("Thread #1", 1000);
        MyThread threadB = new MyThread("Thread #2", 1000);
        MyThread threadC = new MyThread("Thread #3", 1000);

        MyRunnable runnableA = new MyRunnable("Thread #4", 1000);
        MyRunnable runnableB = new MyRunnable("Thread #5", 1000);
        MyRunnable runnableC = new MyRunnable("Thread #6", 1000);

        executor.execute(threadA);
        executor.execute(threadB);
        executor.execute(threadC);

        executor.execute(runnableA);
        executor.execute(runnableB);
        executor.execute(runnableC);

        executor.shutdown();
        try {
            if (executor.awaitTermination(1, TimeUnit.MINUTES)) {
                System.out.println("All Threads has been finalized.");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
