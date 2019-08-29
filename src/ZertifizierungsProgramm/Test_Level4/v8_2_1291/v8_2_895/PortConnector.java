package ZertifizierungsProgramm.Test_Level4.v8_2_1291.v8_2_895;

import java.io.IOException;

/**
 * Created by WSteinle on 02.02.2017.
 */
public class PortConnector {

    public PortConnector(int port) throws IOException {
        if(Math.random() > 0.5) {
            throw new IOException();
        }
        throw new RuntimeException();
    }
}
