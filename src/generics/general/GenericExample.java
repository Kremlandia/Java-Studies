/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics.general;

/**
 *
 * @author eduardo.willian
 */
public class GenericExample<T> {

    T object;

    public GenericExample(T object) {
        this.object = object;
    }

    public T getObject() {
        return this.object;
    }

    public void showType() {
        System.out.println("Type T is -> " + object.getClass().getName());
    }

}
