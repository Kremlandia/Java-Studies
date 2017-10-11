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
public class MainClass {

    public static void main(String[] args) {
        new MyThread("Thread #1", 500);
        new MyThread("Thread #2", 750);
        new MyThread("Thread #3", 1000);

        new MyRunnable("Thread #4", 500);
        new MyRunnable("Thread #5", 750);
        new MyRunnable("Thread #6", 1000);
    }
}
