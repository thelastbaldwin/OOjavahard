public class Buddy implements Comparable {
    private int age;
    private String name;

    public Buddy(String name, int age){
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object ob){
        Buddy other;

        if (ob == null)
            return false;
        try {
            other = (Buddy)ob;
        } catch (ClassCastException e){
            return false;
        }
        return name.equals(other.name) && age == other.age;
    }

    public int compareTo(Object ob){
        Buddy other = (Buddy)ob;

        if(this.name.equals(other.name))
            return this.age - other.age;
        else
            return this.name.compareTo(other.name);
    }

    public String toString(){
        return name + "-" + age;
    }
}