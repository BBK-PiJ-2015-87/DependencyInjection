package guiceApp;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Created by vladimirsivanovs on 11/01/2016.
 */
public class App {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new DisplayModule());
        injector.getInstance(Greeting.class).sayHello();
        injector.getInstance(NewGreeting.class).sayHello();
    }
}

