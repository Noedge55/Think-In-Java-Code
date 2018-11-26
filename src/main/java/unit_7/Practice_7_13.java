package unit_7;
import static net.mindview.util.Print.*;
class AppendNum{
    public int append(int i){
        print("append(int)");
        return i;
    }
    public float append(float f){
        print("append(float)");
        return f;
    }
    public double append(double d){
        print("append(double)");
        return d;
    }
}

class AppendObj extends AppendNum{
    public char append(char c) {
        print("append(char)");
        return c;
    }
}

/**
 * @Description:创建一个类，它应带有一个被重载了三次的方法。继承产生一个新类，并添加一个该方法的新的重载定义，展示这四个方法在导出类中都是可以使用的。
 */
public class Practice_7_13 {
    public static void main(String[] args) {
        AppendObj appendObj = new AppendObj();
        appendObj.append(1);
        appendObj.append(1.0f);
        appendObj.append(1.0D);
        appendObj.append('c');
    }

}
