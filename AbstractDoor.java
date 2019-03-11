public abstract class AbstractDoor {
    protected boolean isOpen;

    public AbstractDoor(boolean isOpen){ this.isOpen = isOpen;}
    public void open() {isOpen = true;}
    public void close() {isOpen = false;}
    public abstract double soundProofing();

    // final -> cannot be overriden in subclass
    public final String toString(){
        return "The door is " + (isOpen ? "open." : "closed.");
    }
}