package unit_7.reusing;
import static net.mindview.util.Print.*;


/**
 * @描述：从Detergent中继承产生一个新的类，覆盖scrub()并添加一个名为sterilize()的新的方法
 */
public class Practice_7_2 extends Detergent {
    //覆盖父类中的scrub()方法
    @Override
    public void scrub() {
        append(" Practice_7_2.scrub()");
        super.scrub();
    }

    //添加新的方法sterilize()
    public void sterilize(){
        append( " sterilize()");
    }

    public static void main(String[] args) {
        Practice_7_2 practice = new Practice_7_2();
        practice.dilute();
        practice.apply();
        practice.scrub();
        practice.foam();
        practice.sterilize();
        print(practice);
        print("Testing base class:");
        Detergent.main(args);
    }

}
