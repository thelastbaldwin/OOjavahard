package zoo;
import zoo.Horse;
import zoo.Llama;

public class ZooDriver2 {
    public static void main(String [] args) {
        Horse bj = new Horse();
        Llama kuz = new Llama();

        System.out.println(bj);
        System.out.println(kuz);
    }
}

/**
 * adding package.zoo; at the top of the file meant I needed to 
 * move this file into the zoo folder for it to compile.
 */