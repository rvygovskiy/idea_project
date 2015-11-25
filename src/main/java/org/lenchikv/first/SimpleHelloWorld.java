package org.lenchikv.first;

/**
 * Created by olenushka on 25.11.2015.
 */
public class SimpleHelloWorld implements HelloWorld {

    public void sayHello(String message) {
        System.out.println(message);
    }

    public void SayHelloTo(String who, String message) {
        System.out.println(String.format("%s, %s", message, who));
    }
}
