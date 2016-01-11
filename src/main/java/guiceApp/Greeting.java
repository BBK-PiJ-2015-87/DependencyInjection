package guiceApp;

import com.google.inject.Inject;

/**
 * Created by vladimirsivanovs on 11/01/2016.
 */
public class Greeting {

    @Inject
//    @Named("Electronic")guiceApp.Display display; //if using named binding
    @MyAnnotations.ForElectronic Display display;

    void sayHello() {
        display.display("HELLO! I'm ");
    }
}
