import java.util.Scanner;

public class StringFunOODriver {
    public static void main( String[] args){
        Scanner keyboard = new Scanner(System.in);

        // input it
        System.out.print("Enter a message: ");
        String msg = keyboard.nextLine();

        StringFunObject sfo = new StringFunObject();
        sfo.setMessage(msg);
        sfo.reverse();
        sfo.camelCase();

        // display it
        System.out.println(sfo.getMessage());

        sfo.half();
        System.out.println(sfo.getMessage());
    }
}

