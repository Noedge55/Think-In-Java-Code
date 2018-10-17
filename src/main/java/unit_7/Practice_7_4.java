package unit_7;
import static net.mindview.util.Print.*;

class SuperClass {
    public SuperClass() {
        print("SuperClass Constructor");
    }
}

class SubClass extends SuperClass{
    public SubClass(int i){
        print("SubClass Constructor");
    }
    public SubClass() {
        this(1);
    }
}

/**
 * 描述:证明基类构造器:(a)总是被调用;(b) 在导出类构造器之前被调用
 * 参考于:https://coderanch.com/t/389355/java/Exercise-Prove-base-class-constructor
 */
public class Practice_7_4 {
    public static void main(String[] args) {
        SubClass subClass = new SubClass();
    }
}
