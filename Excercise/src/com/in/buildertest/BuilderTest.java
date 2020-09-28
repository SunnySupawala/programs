package com.in.buildertest;
import java.util.Base64;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BuilderTest {

    public static void main(String[] args) {
        String sunnys = "Sunny Supawala";
        Set<String> sunny = Stream.of(sunnys).collect(Collectors.toSet());
        System.out.println(sunny);

    }

}
