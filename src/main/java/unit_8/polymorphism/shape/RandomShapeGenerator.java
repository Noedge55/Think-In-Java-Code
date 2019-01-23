package unit_8.polymorphism.shape;
import java.util.Random;

public class RandomShapeGenerator {
    private Random rand = new Random(47);
    public Shape next(){
        switch (rand.nextInt(4)){
            default:
            case 0: return new Circle();
            case 2: return new Square();
            case 1: return new Triangle();
            case 3: return new Ladder();
        }
    }
}

