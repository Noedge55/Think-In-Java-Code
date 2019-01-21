package unit_8.polymorphism.music;
import static net.mindview.util.Print.*;

class Stringed extends Instrument{
    @Override
    public void play(Note n) {
        print("Stringed.play() " + n);
    }
}
class Brass extends Instrument{
    @Override
    public void play(Note n) {
        print("Brass.play() " + n);
    }
}
public class Music2 {
    public static void tune(Wind i){
        i.play(Note.MIDDLE_C);
    }
    public static void tune(Stringed i){
        i.play(Note.MIDDLE_C);
    }
    public static void tune(Brass i){
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flune = new Wind();
        Stringed violin = new Stringed();
        Brass frenchHorn = new Brass();

        tune(flune);
        tune(violin);
        tune(frenchHorn);
    }

}
