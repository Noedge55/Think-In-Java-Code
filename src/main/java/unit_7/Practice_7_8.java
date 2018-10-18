package unit_7;
import static net.mindview.util.Print.*;

class SuperClass_2{
    public SuperClass_2(int i) {
        print("SuperClass_2 Constructor");
    }
}

class SubClass_2 extends SuperClass_2{
    public SubClass_2() {
        super(11);
        print("SubClass_2 Constructor 1");
    }

    public SubClass_2(int i) {
        super(12);
        print("SubClass_2 Constructor 2");
    }
}

/**
 * 创建一个基类，它仅有一个非默认构造器；
 * 在创建一个导出类，它带有默认构造器和非默认构造器。
 * 在导出类的构造器中调用基类的构造器
 */
public class Practice_7_8 {
    public static void main(String[] args) {
        SubClass_2 x = new SubClass_2();
    }
}
