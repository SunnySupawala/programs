package com.in.hashcollision;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MyKey {
    int id ;

    @Override
    public int hashCode() {
        System.out.println("Calling Hash Code");
        return id;
    }


    public void whenHashCodeIsCalledOnPut_thenCorrect() {
        MyKey key = new MyKey();
        key.id = 1;
        Map<MyKey, String> map = new HashMap<>();
        map.put(key, "val");
    }


    public static void main(String[] args) {
        MyKey key = new MyKey();
        key.whenHashCodeIsCalledOnPut_thenCorrect();


        Map<String, String> keys = new HashMap<>();
        String put = keys.put("1", "1");
        String puts = keys.put("1", "2");
        Hashtable hashtable = new Hashtable();


        System.out.println(put);
        System.out.println(puts);
    }
}
