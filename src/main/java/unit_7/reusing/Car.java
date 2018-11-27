package unit_7.reusing;
import static net.mindview.util.Print.*;
/**
 * @Description:练习7.14 在Car.java中给Engine添加一个service()方法，并在main()中调用该方法。
 * Composition with public objects
 */
class Engine{
    public void start(){}
    public void rev(){}
    public void stop(){}
    public void service(){
        print("service()");
    }
}

class Wheel{
    public void inflate(int psi){}
}

class Window{
    public void rollup(){}
    public void rollDown(){}
}

class Door{
    public Window window = new Window();
    public void open(){}
    public void close(){}
}

public class Car {
    public Engine engine = new Engine();
    public Wheel []wheel = new Wheel[4];
    public Door left = new Door(),right = new Door();
    public Car(){
        for(int i = 0 ; i<4 ;i++){
            wheel[i] = new Wheel();
        }
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.left.window.rollup();
        car.wheel[0].inflate(72);
        car.engine.service();
    }

}
