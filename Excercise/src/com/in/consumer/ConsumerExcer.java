package com.in.consumer;

import java.util.function.Consumer;

public class ConsumerExcer {

    public static void main(String[] args) {
        Consumer<String> cs = s-> System.out.println(s);
        cs.accept("Sunny");
    }
}
