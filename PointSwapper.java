public class PointSwapper<Type> {
    private Type a, b;

    public PointSwapper(Type a, Type b){
        this.a = a;
        this.b = b;
    }

    public void swap() {
        Type temp = a;
        a = b;
        b = temp;
    }

    public boolean compare(Type a, Type b) {
        // have to use equals because == would compare memory addresses and I want to compare the value
        return a.equals(this.a) && b.equals(this.b);
    }

    public Type getFirst() {return a;}
    public Type getLast() {return b;}

    public String toString(){
        return "(" + a + ", " + b + ")";
    }
}