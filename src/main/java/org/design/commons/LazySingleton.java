package org.design.commons;

import java.io.Serial;
import java.io.Serializable;
import java.util.HashSet;

public class LazySingleton implements Serializable {

    private static LazySingleton instance;

    private LazySingleton() {

    }

    //Lazy loading
    public static synchronized LazySingleton getInstance() {
        if(instance == null) {
            instance = new LazySingleton();
        }


        return instance;
    }

/*    public static Singleton getInstance() {
        if(instance == null) {
            synchronized (Singleton.class) {
                if(instance == null) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }*/

    protected Object readResolve() {
        return instance;
    }

}

class EagerSingleton {
    private static EagerSingleton INSTANCE = new EagerSingleton();      //As it is constant made it all caps

    private EagerSingleton() {

    }

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {

    }
}
