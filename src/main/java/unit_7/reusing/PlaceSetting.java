package unit_7.reusing;
import static net.mindview.util.Print.*;

class Plate{
    public Plate(int i) {
        print("Plate Constructor");
    }
}

class DinnerPlate extends Plate{
    public DinnerPlate(int i) {
        super(i);
        print("DinnerPlate Constructor");
    }
}

class Utensil{
    public Utensil(int i) {
        print("Utensil Constructor");
    }
}

class Spoon extends Utensil{
    public Spoon(int i) {
        super(i);
        print("Spoon Constructor");
    }
}

class Fork extends Utensil{
    public Fork(int i) {
        super(i);
        print("Fork Constructor");
    }
}

class Knife extends Utensil{
    public Knife(int i) {
        super(i);
        print("Knife Constructor");
    }
}

class Custom{
    public Custom(int i) {
        print("Custom Constructor");
    }
}

public class PlaceSetting extends  Custom{
    private Spoon sp;
    private Fork frk;
    private Knife kn;
    private DinnerPlate pl;

    public PlaceSetting(int i) {
        super(i+1);
        sp = new Spoon(i+2);
        frk = new Fork(i+3);
        kn = new Knife(i+4);
        pl = new DinnerPlate(i+5);
        print("PlaceSetting Constructor");
    }

    public static void main(String[] args) {
        PlaceSetting x = new PlaceSetting(9);
    }
}
