package unit_7;
import unit_7.reusing.Beetle;

import static net.mindview.util.Print.*;

class Scarab extends Beetle{
    private int m = printInit("Scarab.m initialized");

    public Scarab() {
        print("m = " + m);
        print("j = " + j);
    }

    private static int x3 = printInit("static Scarab.x3 initialized");
}

/**
 * @Description:在Beetle.java中，从Beetle类继承产生一个具体类型的“甲壳虫”。其形式与现有类相同，跟踪并解释其输出结果。
 */
public class Practice_7_24 {
    public static void main(String[] args) {
        Scarab scarab = new Scarab();
    }
}
