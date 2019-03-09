public class Guy implements Comparable<Guy> {
    private int age;
    private String name;

    public Guy(String name, int age){
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj){
        // need to cast because this is inherited from Object
        Guy other = (Guy)obj;
        return this.age == other.age && this.name.equals(other.name);
    }

    // don't need to cast because this class implements Comparable<Guy>
    public int compareTo(Guy other){
        if(this.name.equals(other.name))
            return this.age - other.age;
        else
            return this.name.compareTo(other.name);
    }

    public String toString() { return name + "-" + age; }
}