package unit_8.polymorphism.shape;
import static net.mindview.util.Print.*;
public class Ladder extends Shape{
    @Override
    public void draw() {
        print("Ladder.draw()");
    }

    @Override
    public void erase() {
        print("Ladder.erase()");
    }

    @Override
    public void fill() {
        print("Ladder.fill()");
    }
}
