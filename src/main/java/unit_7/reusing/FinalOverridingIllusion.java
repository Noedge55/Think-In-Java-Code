package unit_7.reusing;
import static net.mindview.util.Print.*;

class WithFinals{
    private final void f(){
        print("WithFinals.f()");
    }
    private void g(){
        print("WithFinals.g()");
    }

    public void o(){
        print("WithFinals.o()");
    }
}

class OverridingPrivate extends WithFinals{
    //! @Override
    private final void f(){
        print("OverridingPrivate.f()");
    }
    //! @Override
    private void g(){
        print("OverridingPrivate.g()");
    }

    @Override
    public void o() {
        print("OverridingPrivate.o()");
    }
}

class OverridingPrivate2 extends OverridingPrivate{
    //! @Override
    public final void f(){
        print("OverridingPrivate2.f()");
    }
    //! @Override
    public void g(){
        print("OverridingPrivate2.g()");
    }

    @Override
    public void o() {
        print("OverridingPrivate2.o()");
    }
}

/**
 * @Description:（1）展示@Override注解可以解决本节中的问题，（2）创建一个带final方法的类。由此继承产生一个类并尝试覆盖该方法。
 */
public class FinalOverridingIllusion {
    public static void main(String[] args) {
        OverridingPrivate2 op2 = new OverridingPrivate2();
        op2.f();
        op2.g();
        //可以向上转型
        OverridingPrivate op = op2;
        //但是无法调用跟父类同名的方法，因为该方法并没有被覆盖，只是生成了一个新的同名方法
        //! op.f();
        //! op.g();
        //父类public 方法可以被覆盖
        op.o();

        //下面同理
        WithFinals wf = op;
        //! wf.f();
        //! wf.g();
        wf.o();
    }

}
