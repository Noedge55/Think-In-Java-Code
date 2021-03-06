package unit_7.reusing;
import static net.mindview.util.Print.*;

class Villian{
    private String name ;
    protected void set(String nm){
        name = nm;
    }
    public Villian(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "I'm a Villain and my name is " + name;
    }
}

/**
 * @Description:
 * The Protected keyword
 */
public class Orc extends Villian{
    private int orcNumber;
    public Orc(String name,int orcNumber){
        super(name);
        this.orcNumber = orcNumber;
    }

    protected void change(String name,int orcNumber){
        set(name);
        this.orcNumber = orcNumber;
    }

    @Override
    public String toString() {
        return "Orc " + orcNumber + ": " + super.toString();
    }

    public static void main(String args[]){
        Orc orc = new Orc("Limburger",12);
        print(orc);
        orc.change("Bob",19);
        print(orc);
    }

}
