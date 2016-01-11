package guiceApp;

import com.google.inject.Inject;

/**
 * Created by vladimirsivanovs on 11/01/2016.
 */
public class NewGreeting {
    @Inject
//    @Named("TimesSquare")guiceApp.Display display; //if using named binding
    @MyAnnotations.ForTimesSquare Display display;


    void sayHello() {

        display.display("HELLO! I'm");
    }
}
