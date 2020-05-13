package com.example.task1;

public class ExampleServices {
    public static void example(MyBean bodyIn) {
        bodyIn.setName( "Hello, " + bodyIn.getName() );
        bodyIn.setId((Integer)bodyIn.getId());
    }
}
