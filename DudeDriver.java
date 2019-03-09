public class DudeDriver {
    public static void main( String[] args){
        Dude one = new Dude("Mitch", 39, 50.0);
        Dude two = new Dude("Mitch", 39, 50.0);
        Dude three = one;
        Dude four = new Dude("Curly", 71, 34.0);

        tellMeIfEqual(one, two);
        tellMeIfEqual(one, three);
        tellMeIfEqual(one, four);
        System.out.println();
        tellMeIfStriclyEqual(one, two);
        tellMeIfStriclyEqual(one, three);
    }

    public static <Type> void tellMeIfEqual(Type a, Type b){
        if(a.equals(b)){ 
            System.out.println(a + " equals " + b);
        } else {
            System.out.println(a + " does not equal " + b);
        }
    }

    public static <Type> void tellMeIfStriclyEqual(Type a, Type b){
        if(a == b){
            System.out.println(a + " == " + b);
        } else {
            System.out.println(a + " != " + b);
        }
    }
}