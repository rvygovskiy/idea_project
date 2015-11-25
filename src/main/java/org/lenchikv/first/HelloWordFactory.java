package org.lenchikv.first;

/**
 * Created by olenushka on 25.11.2015.
 */
public class HelloWordFactory {

    public static final String PERFECT = "perfect";

    public static HelloWorld createHelloWorld(String pattern) {
        if (pattern != null && pattern.equalsIgnoreCase(PERFECT)) {
            return new PerfectHelloWorld();
        } else {
            return new SimpleHelloWorld();
        }
    }
}
