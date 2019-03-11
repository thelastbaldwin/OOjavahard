public class GoodDoor extends AbstractDoor {
    public GoodDoor (boolean b){super(b);}

    public double soundProofing() {
        if (isOpen)
            return 0;
        else
            return 8.5;
    }
}