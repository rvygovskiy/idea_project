package org.lenchikv.first;

/**
 * Created by olenushka on 25.11.2015.
 */
public class Hello2 {
    public static final String DEFAULT_MESSAGE = "default message";
    private final String message;
    private final HelloWorld service;

    public Hello2(String message, HelloWorld service) {
        if (message == null) {
            this.message = message;
        } else {
            this.message = DEFAULT_MESSAGE;
        }
        this.service = service;
    }

    public void sendMessage() {
        service.sayHello(message);
    }

    public void sendMessageTo(String who) {
        service.SayHelloTo(who, message);
    }

    public static void main(String[] args) {

        HelloWorld helloWorld = HelloWordFactory.createHelloWorld(getHelloWorldType(args));

        String message = getMessage(args);

        Hello2 service = new Hello2(message, helloWorld);

        service.sendMessage();
        service.sendMessageTo("Elena");
    }

    public static String getHelloWorldType(String[] args) {
        if (args.length > 1) {
            return args[1];
        }
        return null;
    }

    public static String getMessage(String[] args) {
        if (args.length > 0) {
            return args[0];
        }
        return null;
    }
}
