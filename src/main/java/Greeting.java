import com.google.inject.Inject;

/**
 * Created by vladimirsivanovs on 11/01/2016.
 */
public class Greeting {

    @Inject Display display;

    void sayHello() {
        display.display("Hello! I'm a display!");
    }
}
