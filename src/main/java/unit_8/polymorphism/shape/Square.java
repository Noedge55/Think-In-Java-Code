package unit_8.polymorphism.shape;

import static net.mindview.util.Print.print;

public class Square extends Shape{
    @Override
    public void draw() {
        print("Square.draw()");
    }
    @Override
    public void erase() {
        print("Square.erase()");
    }
    @Override
    public void fill() {
        print("Square.fill()");
    }
}
