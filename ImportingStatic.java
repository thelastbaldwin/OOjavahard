import static java.lang.Math.*;
import static java.lang.System.out;
import static java.lang.Integer.MAX_VALUE;

public class ImportingStatic {
    public static void main(String[] args){
        double a = random();
        double b = random();

        out.println(PI);
        out.println(abs(-9));
        out.println(sqrt(2));
        out.println(min(a, b) + " is smaller.");
        out.println(max(a, b) + " is larger.");
        out.println(Math.sin(PI));
        out.println(Math.cos(PI));
        out.println(Math.tan(PI));
        out.println("Integer max value is " + MAX_VALUE);
    }
}