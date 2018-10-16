package unit_7.reusing;
import static net.mindview.util.Print.*;

class Book{
    private String s;
    public Book() {
        print("Book()");
        s = "Constructed";
    }

    @Override
    public String toString() {
        return s;
    }
}

/**
 * 描述：创建一个简单的类，在第二个类中，将一个引用定义为第一个类的对象。运用惰性初始化来实例化对象。
 */
public class Practice_7_1 {
    Book book;

    public Practice_7_1() {
        print("Practice_7_1()");
    }

    @Override
    public String toString() {//当调用toString时实例化book对象
        if(book == null){//惰性初始化
            book = new Book();
        }
        return "book = " + book;
    }

    public static void main(String[] args) {
        Practice_7_1 practice_7_1 = new Practice_7_1();
        print(practice_7_1);
    }
}
