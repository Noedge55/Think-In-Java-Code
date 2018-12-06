package unit_7.reusing;

class SmallBrain{}

final class Dinosaur{
    int i = 7;
    int j = 1;
    SmallBrain x = new SmallBrain();
    void f(){}
}

//！ class Further extends Dinosaur{}    //无法继承final类Dinosaur

/**
 * @Description:（1）创建一个final类并试着继承它
 */
public class Jurassic {
    public static void main(String[] args) {
        Dinosaur n = new Dinosaur();
        n.f();
        n.i = 40;
        n.j++;
    }
}
