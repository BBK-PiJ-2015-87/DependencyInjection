import com.google.inject.Binder;
import com.google.inject.Module;

/**
 * Created by vladimirsivanovs on 11/01/2016.
 */
public class DisplayModule implements Module {
    public void configure(Binder binder) {
        binder.bind(Display.class).to(ElectronicDisplay.class);
    }
}
