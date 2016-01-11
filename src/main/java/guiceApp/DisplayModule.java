package guiceApp;

import com.google.inject.Binder;
import com.google.inject.Module;

/**
 * Created by vladimirsivanovs on 11/01/2016.
 */
public class DisplayModule implements Module {
    public void configure(Binder binder) {
        binder.bind(Display.class)
//                .annotatedWith(Names.named("Electronic")) //if named annotations
                .annotatedWith(MyAnnotations.ForElectronic.class)
                .to(ElectronicDisplay.class);

        binder.bind(Display.class)
//                .annotatedWith(Names.named("TimesSquare")) //if named annotations
                .annotatedWith(MyAnnotations.ForTimesSquare.class)
                .to(TimesSquareDisplay.class);
    }
}
