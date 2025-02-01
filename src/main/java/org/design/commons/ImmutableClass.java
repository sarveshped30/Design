package org.design.commons;

import java.lang.ref.PhantomReference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public final class ImmutableClass {

    private String field1;

    private ArrayList<Integer> field2;


    public ImmutableClass(String field1, ArrayList<Integer> field2) {
        this.field1 = field1;
        this.field2 = new ArrayList<>(field2);
    }


    public void setFiled1(String field1) {
        this.field1 = field1;
    }

    public void addToField2(Integer data) {
        this.field2.add(data);
    }

    public void addAllToField2(ArrayList<Integer> data) {
        field2.addAll(data);
    }

    public String getField1() {
        return field1;
    }

    public ArrayList<Integer> getField2() {
        return new ArrayList<>(field2);
    }

    @Override
    public String toString() {
        return "ImmutableClass{" +
                "field1='" + field1 + '\'' +
                ", field2=" + field2 +
                '}';
    }
}

class Test {

    public static void main(String[] args) {
        ImmutableClass immutableClass = new ImmutableClass("Sarvesh", new ArrayList<>());

        immutableClass.addToField2(1);
        immutableClass.addToField2(2);

        ArrayList<Integer> data = immutableClass.getField2();

        data.add(3);
        data.add(4);

        System.out.println(immutableClass);
        System.out.println(data);

       /* new WeakReference<>();
        new PhantomReference<>();*/

    }
}
