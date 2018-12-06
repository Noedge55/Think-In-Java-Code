package unit_7;
import static net.mindview.util.Print.*;

class Car{
    public static int i = f();
    public static int f(){
        print("class Car initialized");
        return 10;
    }
}

/**
 * @Description:请证明加载类的动作仅仅发生了一次。证明该类的第一个实体的创建或者对static成员的的访问都有可能引起加载
 */
public class Practice_7_23 {
    public static void main(String[] args) {
        new Car();
        print(Car.i);
    }
}
