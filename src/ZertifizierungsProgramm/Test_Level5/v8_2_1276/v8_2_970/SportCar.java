package ZertifizierungsProgramm.Test_Level5.v8_2_1276.v8_2_970;

/**
 * Created by WSteinle on 06.02.2017.
 */
public class SportCar extends Car {
    public int gearRatio = 9;
    public String accelerate() {
        return "Accelerate : SportCar";
    }

    public static void main(String[] args) {
        Car c = new SportCar();
        System.out.println(c.gearRatio + " " + c.accelerate());

        MyClass my = new SportCar();
        System.out.println(my.accelerate());

    }
}
