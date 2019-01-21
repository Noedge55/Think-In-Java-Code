package unit_8;
import static net.mindview.util.Print.*;

/**
 * @Description: 创建一个Cycle类，它具有子类Unicycle，Bicycle，Tricycle。演示每一个类型的实例都可以经由ride()方法向上转型为Cycle
 * @reference: http://greggordon.org/java/tij4/polymorphism/Biking.java (参考引用，侵删)
 */
class Cycle{
    String name = "Cycle";

    public static void travel(Cycle c){
        print("Cycle.ride()" + c);
    }

    @Override
    public String toString() {
        return this.name;
    }
}

class Unicycle extends Cycle{
    String name = "Unicycle";
    @Override
    public String toString() {
        return this.name;
    }
}
class Bicycle extends Cycle{
    String name = "Bicycle";
    @Override
    public String toString() {
        return this.name;
    }
}
class Tricycle extends Cycle{
    String name = "Tricycle";
    @Override
    public String toString() {
        return this.name;
    }
}


public class Practice_8_1 {
    public static void ride(Cycle c){
        c.travel(c);
    }

    public static void main(String[] args) {
        Unicycle u = new Unicycle();
        Bicycle b = new Bicycle();
        Tricycle t = new Tricycle();
        ride(u);
        ride(b);
        ride(t);
    }
}
