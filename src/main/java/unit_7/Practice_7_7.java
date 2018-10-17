package unit_7;

import static net.mindview.util.Print.print;

class A_1{
    public A_1(int i) {
        print("A Constructor");
    }
}

class B_1{
    public B_1(int i) {
        print("B Constructor");
    }
}

class C_1 extends A_1 {
    public C_1() {
        super(11);
        B_1 b_1 = new B_1(11);
        print("C Constructor");
    }
}

/**
 * 描述:修改练习5,使A和B以带参数的构造器取代默认的构造器.
 * 为C编写一个构造器,并在其中执行所有的初始化.
 */
public class Practice_7_7 {
    public static void main(String[] args) {
        C_1 c = new C_1();
    }
}
