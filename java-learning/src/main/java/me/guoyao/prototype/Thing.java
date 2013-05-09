package me.guoyao.prototype;

/**
 * User: guoyao
 * Time: 05-09-2013 18:35
 */
public class Thing implements Cloneable {

    public Thing() {
        System.out.println("constructor executed");
    }

    @Override
    public Thing clone() {
        Thing thing = null;
        try {
            thing = (Thing) super.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return thing;
    }
}
