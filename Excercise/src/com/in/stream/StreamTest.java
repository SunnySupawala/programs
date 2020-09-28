package com.in.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

    public static void main(String[] args) {
        List<Integer>  l = new ArrayList<>();
        l.add(16);
        l.add(56);
        l.add(889);
        l.add(16);
        l.add(16);
        l.add(16);

        l.stream().forEach(System.out::println);
        Integer[] arrayList = l.stream().toArray(Integer[]::new);
        for (Integer ith :arrayList) {
            System.out.println(ith);
            Stream.of(arrayList).forEach(System.out::println);

        }

        Map<Integer, String> hmap = new HashMap<>();
        hmap.put(11, "Apple");
        hmap.put(22, "Orange");
        hmap.put(33, "Kiwi");
        hmap.put(44, "Banana");


        Map<Integer, String> gd = hmap.entrySet().stream().filter(s -> s.getValue().equals("Apple"))
                .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));

        gd.entrySet().forEach(System.out::println);


    }
}
