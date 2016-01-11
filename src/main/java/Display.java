/**
 * Created by vladimirsivanovs on 11/01/2016.
 */
public class Display {
    private static int count = 0;

    public Display() {
        count++;
    }
    void display(String string) {
        System.out.println("display count is :" + count);
        System.out.println(string);
    }
}
