import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Created by vladimirsivanovs on 11/01/2016.
 */
public class App {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector();
        Greeting greeting = injector.getInstance(Greeting.class);
        greeting.sayHello();
        injector.getInstance(Greeting.class).sayHello();
    }
}

