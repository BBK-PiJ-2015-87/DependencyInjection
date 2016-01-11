import com.google.inject.Inject;

/**
 * Created by vladimirsivanovs on 11/01/2016.
 */
public class Greeting {
    private static int count = 0;

    public Greeting() {
        count++;
    }
    @Inject private Display display;

    void sayHello() {
        System.out.println("Greeting class count: " + count);
        System.out.println("Hello display!");
        display.display("Hello! I'm a display!");
    }
}
