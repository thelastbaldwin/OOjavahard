public class Fish {
    private String name, color;
    private int id;
    private static int count = 0;

    public Fish(String name){
        this.name = name;
        this.color = count % 2 == 0 ? "red" : "blue";
        count++;
        id = count;
    }

    public String toString(){
        return name + ", " + color + " fish #" + id + " of " + count;
    }

    public static int numCreated(){
        return count;
    }
}