public class InterfacePleaser2 implements ArbitraryInterface {
    private int max;

    public InterfacePleaser2(){
        // calls the parameterized constructor that follows
        // must be on the first line
        this(0);
    }

    public InterfacePleaser2( int max){
        this.max = max;
    }

    public int getMax() {
        return max;
    }

    public void doSomething(int somethingOtherThanN){}

    public double getNumber(){
        return Math.random() * max;
    }
}