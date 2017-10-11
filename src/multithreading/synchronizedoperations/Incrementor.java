/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading.synchronizedoperations;

/**
 *
 * @author eduardo.willian
 */
public class Incrementor {

    private int value;

    public int increment(int value, int times) {
        for (int i = 0; i < times; i++) {
            this.value++;
        }
        return this.value;
    }
}
