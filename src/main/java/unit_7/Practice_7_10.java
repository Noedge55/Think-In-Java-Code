package unit_7;

import static net.mindview.util.Print.print;

class Compent1_1{
    public Compent1_1(int i){
        print("Compent1_1 Constructor param");
    }
}

class Compent2_1{
    public Compent2_1(int i) {
        print("Compent2_1 Constructor param");
    }
}

class Compent3_1{
    public Compent3_1(int i) {
        print("Compent3_1 Constructor param");
    }
}

class Root_1{
    private Compent1_1 compent1_1 ;
    private Compent2_1 compent2_1 ;
    private Compent3_1 compent3_1 ;

    public Root_1(int i) {
        compent1_1 = new Compent1_1(11);
        compent2_1 = new Compent2_1(11);
        compent3_1 = new Compent3_1(11);
        print("Root_1 Constructor param");
    }
}

class Stem_1 extends Root_1{
    private Compent1_1 compent1_1 ;
    private Compent2_1 compent2_1 ;
    private Compent3_1 compent3_1 ;

    public Stem_1(int i) {
        super(i);
        compent1_1 = new Compent1_1(11);
        compent2_1 = new Compent2_1(11);
        compent3_1 = new Compent3_1(11);
        print("Stem_1 Constructor param");
    }
}

/**
 * @描述：修改练习7_9使每个类都仅具有非默认的构造器
 */
public class Practice_7_10 {
    public static void main(String[] args) {
        Stem_1 stem1 = new Stem_1(11);
    }
}