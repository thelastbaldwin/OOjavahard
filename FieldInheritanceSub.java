public class FieldInheritanceSub extends FieldInheritance {
    public FieldInheritanceSub() { super ();}
    public FieldInheritanceSub(String first, String last) {
        super(first, last);
    }

    public void test() {
        // first = "GOOD"; // error: first has private access in FieldInheritance
        super.setFirst("GOOD");
        last = "COFFEE";
    }
}