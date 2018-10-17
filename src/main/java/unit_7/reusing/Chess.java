//Inheritance,Constructors and arguments (继承，构造函数和参数)
package unit_7.reusing;
import static net.mindview.util.Print.*;

class Game{
    public Game(int i) {
        print("Game constructor");
    }
}

class BoardGame extends Game{

    /**
     * 必须显式调用基类构造方法
     * @param i
     */
    public BoardGame(int i) {
        super(i);
        print("BoardGame constructor");
    }

//    /**
//     * 必须调用基类构造方法,否则提示错误
//     * @param i
//     */
//    public BoardGame(int i) {
//        print("BoardGame constructor");
//    }

//    /**
//     * 调用基类构造器必须写在构造方法的第一行,否则提示错误
//     * @param i
//     */
//    public BoardGame(String i){
//        print("BoardGame constructor");
//        super(Integer.parseInt(i));
//    }

}

public class Chess extends BoardGame{
    public Chess() {
        super(11);
        print("Chess constructor");
    }

    public static void main(String[] args) {
        Chess x = new Chess();
    }
}
