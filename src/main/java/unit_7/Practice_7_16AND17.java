package unit_7;
import static net.mindview.util.Print.*;

class Amphibian{
    public void eat(){
        print(this.getClass().getSimpleName()+":eat");
    }
    public void swim(){
        print(this.getClass().getSimpleName()+":swim");
    }
    public void crawl(){
        print(this.getClass().getSimpleName()+":crawl");
    }
    public static void doSomething(Amphibian a){
        a.eat();
        a.swim();
        a.crawl();
    }
}

class Frog extends Amphibian{
    public void jump(){
        print(this.getClass().getSimpleName()+":jump");
    }

    //覆盖后子类将调用覆盖后的方法
    @Override
    public void swim() {
        print("change:"+this.getClass().getSimpleName() + ":swim");
    }
}

/**
 * @Description:创建一个名为Amphibian的类。由此继承产生一个称为Frog的类。在基类中设置适当的方法。在main()中，创建一个Frog并向上转型至Amphibian，然后说明所有的方法都可以工作
 */
public class Practice_7_16AND17 {
    public static void main(String[] args) {
        Frog frog = new Frog();
        Amphibian.doSomething(frog);
        frog.jump();
    }

}
