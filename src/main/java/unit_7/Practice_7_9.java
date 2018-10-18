package unit_7;
import static net.mindview.util.Print.*;

class Compent1{
    public Compent1() {
        print("Compent1 Construct");
    }
}

class Compent2{
    public Compent2() {
        print("Compent2 Construct");
    }
}

class Compent3{
    public Compent3() {
        print("Compent3 Construct");
    }
}

class Root{
    private Compent1 compent1 = new Compent1();
    private Compent2 compent2 = new Compent2();
    private Compent3 compent3 = new Compent3();

    public Root() {
        print("root Construct");
    }
}

class Stem extends Root{
    private Compent1 compent1 = new Compent1();
    private Compent2 compent2 = new Compent2();
    private Compent3 compent3 = new Compent3();

    public Stem() {
        print("root Construct");
    }
}

/**
 * @描述：创建一个root类，另其含有名为component1、component2、component3的类的各一个实例（这些也由你写）。
 * 从Root中派生一个类Stem，也含有上述各个“组成部分”。所有的类都应该带有可打印出类相关信息的默认构造器
 */
public class Prictice_7_9 {
    public static void main(String[] args) {
        Stem stem = new Stem();
    }
}