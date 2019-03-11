public class DoorDriver {
    public static void main(String[] args){
        // AbstractDoor d1 = new AbstractDoor(true); // CAN'T BE INSTANTIATED
        // BadDoor d2 = new BadDoor(true); // WON'T COMPILE

        GoodDoor d3 = new GoodDoor(false);
        System.out.println(d3);
        System.out.println("\tSound-proofing level: " + d3.soundProofing());
        d3.open();
        System.out.println(d3);
        System.out.println("\tSound-proofing level: " + d3.soundProofing());

        AbstractDoor d4 = new GoodDoor(true);
        System.out.println(d4);
        System.out.println("\tSound-proofing level: " + d4.soundProofing());

        AbstractDoor d5 = new WeakDoor(false);
        System.out.println(d5);
        System.out.println("\tSound-proofing level: " + d5.soundProofing());
    }
}