package me.guoyao.prototype;

import java.util.ArrayList;

/**
 * User: guoyao
 * Time: 05-09-2013 18:35
 */
public class Thing implements Cloneable {

    private ArrayList<String> arrayList = new ArrayList<String>();

    public Thing() {
        System.out.println("constructor executed");
    }

    public void setValue(String value) {
        this.arrayList.add(value);
    }

    public ArrayList<String> getValue() {
        return this.arrayList;
    }

    @Override
    public final Thing clone() {
        Thing thing = null;
        try {
            thing = (Thing) super.clone();
//            thing.arrayList = (ArrayList<String>)this.arrayList.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return thing;
    }
}
