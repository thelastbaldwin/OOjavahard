public class Dude {
    private int age;
    private String name;
    private double weight;

    public Dude(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    private boolean equalish(double a, double b){
        return (Math.abs(a-b) <= 0.01) ? true : false;
    }

    @Override
    public boolean equals(Object obj){
        Dude other;        

        if(obj == null)
            return false;
        try {
            other = (Dude)obj;
        } catch (ClassCastException e){
            return false; // they're not equal if it isn't even a dude
        }
        return (this.age == other.age && this.name.equals(other.name) && equalish(this.weight, other.weight));
    }

    @Override
    public String toString(){
        return name + "|" + age + "|" + weight;
    }
}