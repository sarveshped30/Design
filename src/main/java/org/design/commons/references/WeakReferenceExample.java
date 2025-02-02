package org.design.commons.references;

import java.util.WeakHashMap;

public class WeakReferenceExample {

    public static void main(String[] args) {

        //weak reference is supposed to be Garbage collected unless it is strongly referenced

        //Create cache or temporary mappings using weak reference

        //Weak reference for keys
        WeakHashMap<String, Integer> map = new WeakHashMap<>();

        String name = new String("Sarvesh");

        map.put(name, 100);

        System.out.println(map.get(name));

        //Removing Strong reference
        name = null;

        System.out.println(map.isEmpty());
        System.out.println(map.get(name));

        //Forcing GC
        System.gc();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ix) {
            System.out.println(ix.getMessage());
        }

        if(map.isEmpty()) {
            System.out.println("weak reference is cleared by GC..");
        } else {
            System.out.println("Object present...");
        }


        /** In case of value as weak Reference we have explicitly create new WeakReference<>()
         * object and once removed strong reference object from it the GC will clear it from memory,
         * but it will not clear the Entry set as key still persists.
         *
         *
         * In case of normal HashMap, for weak referencing of key and value, we have to explicitly
         * provide weak reference object for both key and value, but in case of WeakHashMap
         * the key will by default have weak reference, no explicit mentioning required
         */

    }
}
