package Ekkel_Book.Chapter_11_Kollektsii_Objektov;

import java.util.Arrays;
import java.util.List;


/**
 * Created by WSteinle on 31.03.2017.
 */
class Snow {}
class Powder extends Snow{}
class Light extends Powder{}
class Heavy extends Powder{}
class Crusty extends Snow{}
class Slush extends Snow{}

public class AsListInterence_S330 {
    public static void main(String[] args) {
        List<Snow> snow1 = Arrays.asList(new Crusty(), new Slush(), new Powder());
        //не откомпилируется
        List<Snow> snow2 = Arrays.asList(new Light(), new Heavy());
        List<Snow> snow3 = Arrays.<Snow>asList(new Light(), new Heavy());

    }
}
