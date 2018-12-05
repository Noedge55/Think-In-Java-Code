package unit_7.reusing;

/**
 * @Description: "Blank" final fields
 * @Description2: 创建一个含有指向某个对象的空白final引用的类。在所有构造器内部都执行空白final的初始化动作。说明java确保final在使用前必须被初始化，且一旦被初始化即无法改变。
 */

class Poppet{
    private int i;

    public Poppet(int i) {
        this.i = i;
    }
}

public class BlankFinal {
    private final int i = 0;
    private final int j;
    private final Poppet p;

    public BlankFinal() {
        this.j = 1;
        this.p = new Poppet(1);
    }

    public BlankFinal(int x) {
        this.j = x;
        this.p = new Poppet(47);
    }

    public static void main(String[] args) {
        new BlankFinal();
        new BlankFinal(47);
        BlankFinal blankFinalOne = new BlankFinal();
        //! blankFinal_one.j = 20;                  //final基本数据类型初始化后无法被改变
        //! blankFinal_one.p = new Poppet(20);      //final对象初始化后无法改变其引用
    }
}
