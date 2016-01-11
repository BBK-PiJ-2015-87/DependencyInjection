package guiceApp;

/**
 * Created by vladimirsivanovs on 11/01/2016.
 */
public class ElectronicDisplay implements Display {
    private static int count = 0;

    public void display(String string) {
        System.out.println(string + " ELECTRONIC");
        count++;
    }
}
