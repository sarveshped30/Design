package org.design.commons.references;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.lang.ref.SoftReference;
import java.util.HashMap;

public class SoftReferenceExample {

    public static void main(String[] args) {
        //Simple cache using softReference
        Map<String, SoftReference<int[]>> cache = new HashMap<>();

        int[] largeArray = new int[100000000];
        cache.put("largeArray", new SoftReference<>(largeArray));

        if(cache.get("largeArray").get() != null) {
            System.out.println("cache exists....");
        } else {
            System.out.println("Cache released...");
        }

        try {
            List<int[]> allocations = new ArrayList<>();
            for (int i = 0; i < 1000; i++) {
                allocations.add(new int[100000000]); // Allocate in chunks
            }
        } catch(OutOfMemoryError e) {
            System.out.println("Out of memory error, cache might be cleared!");
        }


        if(cache.get("largeArray").get() == null) {
            System.out.println("Cache cleared from memory...");
        } else {
            System.out.println("Object still present...");
        }

    }
}
