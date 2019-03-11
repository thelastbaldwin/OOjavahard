public class WeakDoor extends AbstractDoor {
    public WeakDoor(boolean isOpen){super(isOpen);}

    public double soundProofing(){
        return isOpen ? 0 : 5.5;
    }
}