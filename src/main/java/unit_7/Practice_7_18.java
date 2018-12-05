package unit_7;
import java.util.Random;

import static net.mindview.util.Print.*;

class Diff{
    
}

/**
 * @Description:创建一个含有static final域和final域的类，说明两者的区别。
 */
public class Practice_7_18 {

    private final Diff diff_one = new Diff();
    private static final Diff DIFF_TWO = new Diff();

    String name ;

    public Practice_7_18(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + "------> " + "diff_one: " + diff_one + " , DIFF_TWO: " + DIFF_TWO;
    }

    public static void main(String[] args) {
        Practice_7_18 p1 = new Practice_7_18("p1");
        Practice_7_18 p2 = new Practice_7_18("p2");
        print(p1);
        print(p2);
    }
}
