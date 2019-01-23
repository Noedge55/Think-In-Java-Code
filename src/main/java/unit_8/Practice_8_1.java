package unit_8;
import static net.mindview.util.Print.*;

/**
 * @Description: 练习1：创建一个Cycle类，它具有子类Unicycle，Bicycle，Tricycle。演示每一个类型的实例都可以经由ride()方法向上转型为Cycle
 *               练习5：以练习1为基础，在Cycle中添加wheels()方法，它将返回轮子的数量。修改ride()方法，让它调用wheels()方法，并验证多态起作用了。
 * @reference: http://greggordon.org/java/tij4/polymorphism/Biking.java (参考引用，侵删)
 */
class Cycle{
    String name = "Cycle";

    public static void travel(Cycle c){
        print("Cycle.ride()" + c);
    }

    public static int wheels(int n,Cycle c){
        print("the number of " + c + " wheels is " + n);
        return n;
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
        c.wheels(4,c);
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
