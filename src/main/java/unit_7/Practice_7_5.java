package unit_7;
import static net.mindview.util.Print.*;

class A{
    public A() {
        print("A Constructor");
    }
}

class B{
    public B() {
        print("B Constructor");
    }
}

class C extends A{
    private B a = new B();
}

/**
 * 描述:创建两个带有默认构造器(空参数列表)的类A和类B.从A中继承产生一个名为C的新类,并在C内创建一个B类的成员.
 * 不要给C编写构造器.创建一个C类的对象并观察其结果
 */
public class Practice_7_5 {
    public static void main(String[] args) {
        C c = new C();
    }
}
