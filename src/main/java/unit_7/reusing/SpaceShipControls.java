package unit_7.reusing;
import static net.mindview.util.Print.*;

public class SpaceShipControls {
    public void up(int velocity){
        print("up " + velocity + " velocity");
    }
    public void down(int velocity){
        print("down " + velocity + " velocity");
    }
    public void left(int velocity){
        print("left " + velocity + " velocity");
    }
    public void right(int velocity){
        print("right " + velocity + " velocity");
    }
    public void forward(int velocity){
        print("forward " + velocity + " velocity");
    }
    public void back(int velocity){
        print("back " + velocity + " velocity");
    }
    public void turboBoost(){
        print("turboBoost");
    }
}
