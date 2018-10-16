package unit_7.reusing;
//Inheritance Syntax & properties(继承语法和属性)
import static net.mindview.util.Print.*;

class Cleanser{
    private String s = "Cleanser";
    public void append(String a){
        s += a;
    }
    public void dilute(){
        append(" dilute()");
    }
    public void apply(){
        append(" apply()");
    }
    public void scrub(){
        append(" scrub()");
    }

    @Override
    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute();
        x.apply();;
        x.scrub();
        print(x);
    }
}

public class Detergent extends Cleanser{
    // Change a method (覆盖父类中的方法)
    @Override
    public void scrub() {
        append(" Detergent.scrub()");
        super.scrub();
    }

    //Add methods to the interface (为该接口添加新的方法)
    public void foam(){
        append( " foam()");
    }

    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        print(x);
        print("Testing base class:");
        Cleanser.main(args);
    }
}
