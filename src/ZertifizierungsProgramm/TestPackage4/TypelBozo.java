package ZertifizierungsProgramm.TestPackage4;

/**
 * Created by WSteinle on 24.01.2017.
 */
public class TypelBozo implements Bozo {
    public TypelBozo() {
        //type = 1;
    }
    public void jump() {
        System.out.println("jumping" + type);
    }

    String s =  this.toString();
}
