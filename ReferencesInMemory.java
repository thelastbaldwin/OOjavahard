import java.util.Scanner;
import java.util.ArrayList;

class Example {}

public class ReferencesInMemory {
    public static void main( String[] args){
        int age = 41;
        String name = "Gosling";

        int[]  digits = {3, 1, 4, 1, 5, 9, 2};
        Scanner keyboard = new Scanner(System.in);
        ArrayList arr = new ArrayList();
        Integer year = new Integer(1995);
        Object obj = new Object();
        Example ex = new Example();

        System.out.println(digits);
        System.out.println(obj);
        System.out.println(ex);
        System.out.println();

        String[] names = {"John", "Paul", "George", "Ringo", "Brian"};
        System.out.println(names);
    }
}