package unit_7.reusing;
//Constructor calls during inheritance. (继承中构造方法的调用)
import static net.mindview.util.Print.*;

class Art{
    Art(){print("Art constructor");}
}

class Drawing extends Art{
    Drawing(){print("Drawing constructor");}
}


public class Cartoon extends Drawing{
//    public Cartoon() {
//        print("Cartoon constructor");
//    }
    //创建默认的构造器(Cartoon(){super()})

    public static void main(String[] args) {
        Cartoon x = new Cartoon();
    }
}
