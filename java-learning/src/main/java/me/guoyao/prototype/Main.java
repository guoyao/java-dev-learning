package me.guoyao.prototype;

/**
 * User: guoyao
 * Time: 05-09-2013 18:37
 */
public class Main {

    public static void main(String[] args) {
        Thing thing = new Thing();
        thing.setValue("A");
        Thing clonedThing = thing.clone();
        clonedThing.setValue("B");
        System.out.println(thing.getValue());
    }
}
