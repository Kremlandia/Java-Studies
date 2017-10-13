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
package threads.safe;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Eduardo
 */
public class SimpleArray {

    private final int array[];
    private int writeIndex;
    private final Random generator = new Random();

    public SimpleArray(int size) {
        array = new int[size];
    }

    public synchronized void add(int value) {
        int position = writeIndex;

        try {
            Thread.sleep(generator.nextInt(500));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        array[position] = value;
        System.out.printf("%s wrote %2d to element %d. \n", Thread.currentThread().getName(), value, position);

        ++writeIndex;
        System.out.printf("Next write index: %d\n", writeIndex);
    }

    @Override
    public String toString() {
        return "\nContents of SimpleArray:\n" + Arrays.toString(array);
    }

}
