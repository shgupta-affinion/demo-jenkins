package com.tavisca;

public class HelloWorld {
    public static void main(String[] args) {
        Greet greet = new Greet();
        System.out.println( greet.hello("Pete") );
        System.out.println( greet.bye("Pete") );
    }
}
