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
public class GenericTest {

    public static void main(String[] args) {
        GenericExample<String> genericInteger = new GenericExample<>(Double.toString(Double.MAX_EXPONENT));
        genericInteger.showType();

        GenericExample<Float> genericFloat = new GenericExample<>(Float.MAX_VALUE);
        genericFloat.showType();

        GenericExample<Character> genericString = new GenericExample<>('a');
        genericString.showType();
    }
}
