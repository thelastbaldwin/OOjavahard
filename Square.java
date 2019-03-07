public class Square extends Rect {
    public Square(){
        // only legal as the first line in a constructor
        super();
    }

    public Square(double side){ super(side, side); }
    public String toString(){
        // return "Square, " + super.getLength() + "x" + super.getLength();
        return "Square, " + getLength() + "x" + getLength();
    }

}