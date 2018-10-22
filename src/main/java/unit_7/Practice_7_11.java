package unit_7;

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
}

class Detergent{
    private String name;
    private Cleanser cleanser = new Cleanser();

    public Detergent(String name) {
        this.name = name;
    }

    public void dilute(){
        cleanser.dilute();
    }
    public void apply(){
        cleanser.apply();
    }
    public void scrub(){
        cleanser.scrub();
    }
    //Add methods to the interface (为该接口添加新的方法)
    public void foam(){
        cleanser.append( " foam()");
    }

    @Override
    public String toString() {
        return cleanser.toString();
    }
}

/**
 * @描述:修改Detergent.java，让它使用代理
 */
public class Practice_7_11 {
    public static void main(String[] args) {
        Detergent x = new Detergent("Detergent");
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        print(x);
    }
}
