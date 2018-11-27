package unit_7.reusing;

class Instrument{
    public void play(){}
    static void tune(Instrument i){
        i.play();
    }
}

/**
 * @Description:
 * Inheritance & upcasting
 */
public class Wind extends Instrument{
    public static void main(String[] args) {
        Wind flute = new Wind();
        Instrument.tune(flute); //Upcasting
    }
}
