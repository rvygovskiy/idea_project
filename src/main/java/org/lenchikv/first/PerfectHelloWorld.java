package org.lenchikv.first;

/**
 * Created by olenushka on 25.11.2015.
 */
public class PerfectHelloWorld implements HelloWorld {

    public void sayHello(String message) {
        System.out.println(message + " from the perfectness");
    }

    public void SayHelloTo(String who, String message) {
        System.out.println(String.format("%s from the perfectness, %s", message, who));
    }

}
