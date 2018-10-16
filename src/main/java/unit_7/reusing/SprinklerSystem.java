package unit_7.reusing;

class WaterSource{
    private String s ;
    public WaterSource(){
        System.out.println("WaterSource()");
        s = "Constructed";
    }

    @Override
    public String toString() {
        return s;
    }
}

public class SprinklerSystem {
    //String 默认初始化为 null
    private String value1,value2,value3,value4,value5;
    private WaterSource source = new WaterSource();
    //int 默认初始化为0
    private int i ;
    //float和double 默认初始化为0.0
    private float f;
    private double d;

    @Override
    public String toString() {
        return
                "value1 = " + value1 + " " +
                "value2 = " + value2 + " " +
                "value3 = " + value3 + " " +
                "value4 = " + value4 + "\n" +
                "i = " + i + " " + "f = " + f + " " + "d = " + d + " " +
                "source = " + source;
    }

    public static void main(String[] args) {
        SprinklerSystem sprinklers = new SprinklerSystem();
        System.out.println(sprinklers);
    }
}

