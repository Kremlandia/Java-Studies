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
package thread.synced.threadsafe;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Eduardo
 */
public class SharedArrayTest {

    public static void main(String[] args) {

        SimpleArray sharedSimpleArray = new SimpleArray(6);

        ArrayWriter writer1 = new ArrayWriter(1, sharedSimpleArray);
        ArrayWriter writer2 = new ArrayWriter(11, sharedSimpleArray);

        ExecutorService executor = Executors.newCachedThreadPool();
        executor.execute(writer1);
        executor.execute(writer2);

        executor.shutdown();

        try {
            boolean tasksEnded = executor.awaitTermination(1, TimeUnit.MINUTES);
            if (tasksEnded) {
                System.out.println(sharedSimpleArray);
            } else {
                System.out.println("Timed out while waiting for tasks to finish.");
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted while waiting for tasks to finish.");
        }
    }
}
