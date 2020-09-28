package com.in.constructorreference;

public class ConstructorReferenceTest {

    public static void main(String[] args) {
        TestInter i = Sample::new;
        i.get();
        i.get();
        i.get();
        i.get();
        i.get();
    }
}
