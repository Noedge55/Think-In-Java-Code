package unit_7;

import unit_7.reusing.Orc;
import static net.mindview.util.Print.*;
/**
 * @Description:在包中编写一个类，类应具备一个protected方法。在包外部，试着调用该类的protected方法并解释其结果。然后，从你的类中
 */

class Other {
    private Orc orc = new Orc("Limburger",12);
    public Other(){
        //包外无法调用包内的protected方法
        //orc.change("Bob",19);
    }
}

class OrcChild extends Orc{
    public OrcChild(String name, int orcNumber) {
        super(name, orcNumber);

    }

    @Override
    protected void change(String name, int orcNumber) {
        super.change(name, orcNumber);
    }

    @Override
    public String toString() {
        return "OrcChild" + super.toString();
    }
}

public class Practice_7_15 {
    public static void main(String[] args) {
        OrcChild oc = new OrcChild("Eric",18);
        print(oc);
        oc.change("Tom",16);
        print(oc);
    }
}
