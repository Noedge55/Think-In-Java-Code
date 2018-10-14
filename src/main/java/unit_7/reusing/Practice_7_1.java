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
